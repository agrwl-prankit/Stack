package stackUsingDLL;

public class stackUsingDLLMain {
    public static void main(String[] args) {
        StackUsingDLL stack = new StackUsingDLL();
        stack.push(1);
        stack.peek();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.peek();
    }
}
