package stackUsingLL;

public class StackUsingLL {

    Node head;
    Node tail;

    public void push(int data){
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        System.out.println(data + " inserted successfully");
    }

    public void pop(){
        Node temp = head;
        Node previous = null;
        if (isEmpty()) System.out.println("Stack is already empty");
        else {
            while (temp.getNext() != null){
                previous = temp;
                temp = temp.getNext();
            }
            if (previous == null) head = null;
            else previous.setNext(null);
            tail = previous;
            System.out.println(temp.getData() + " removed successfully");
        }
    }

    public void peek(){
        if (isEmpty()) System.out.println("Stack is empty");
        else System.out.println("peek element is: " + tail.getData());
    }

    public void show(){
        if (isEmpty()) System.out.println("Stack is empty");
        else {
            Node temp = head;
            while (temp != null){
                System.out.print(temp.getData());
                temp = temp.getNext();
                if (temp != null) System.out.print(" -> ");
            }
            System.out.println();
        }
    }

    public void size(){
        Node temp = head;
        int size = 0;
        if (isEmpty()) System.out.println("No element present");
        else {
            while (temp != null){
                size++;
                temp = temp.getNext();
            }
            System.out.println("Size of stack is: " + size);
        }
    }

    public boolean isEmpty(){
        return head == null;
    }
}
