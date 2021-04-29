package stackUsingLL;

public class stackUsingLL {

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

    }

    public void peek(){
        System.out.println("peek element is: " + tail.getData());
    }

    public boolean isEmpty(){
        return head == null;
    }
}
