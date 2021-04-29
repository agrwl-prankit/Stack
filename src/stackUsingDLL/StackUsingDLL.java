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

    public void peek(){
        System.out.println("peek element is: " + tail.getData());
    }

    public boolean isEmpty(){
        return head == null;
    }
}
