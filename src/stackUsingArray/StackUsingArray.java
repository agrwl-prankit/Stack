package stackUsingArray;

public class StackUsingArray {

    int[] stack = new int[5];
    int top = -1;    // to store the index where the last element is present

    private boolean isFull() {
        return top == stack.length-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
