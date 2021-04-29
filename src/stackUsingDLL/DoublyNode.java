package stackUsingDLL;

public class DoublyNode {

    private DoublyNode previous, next;
    private int data;

    public DoublyNode(int data) {
        this.data = data;
        previous = null;
        next = null;
    }

    public DoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
