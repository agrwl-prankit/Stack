package stackUsingDLL;

public class StackUsingDLL {

    DoublyNode head, tail;

    public void push(int data){
        DoublyNode newNode = new DoublyNode(data);
        if (isEmpty()){
            head = newNode;
        }
        else {
            DoublyNode temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
            newNode.setPrevious(temp);
        }
        tail = newNode;
        System.out.println(data + " inserted successfully");
    }

    public void pop(){
        if (isEmpty()) System.out.println("Stack is already empty");
        else {
            DoublyNode temp = head, previous = null;
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
            DoublyNode temp = head;
            while (temp != null){
                System.out.print(temp.getData());
                temp = temp.getNext();
                if (temp != null) System.out.print("->");
            }
            System.out.println();
        }
    }

    public void size(){
        if (isEmpty()) System.out.println("No element available");
        else{
            DoublyNode temp = head;
            int size = 0;
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
