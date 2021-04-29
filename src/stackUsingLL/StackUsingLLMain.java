package stackUsingLL;

public class StackUsingLLMain {
    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(9);
        stack.push(4);
        stack.push(9);
        stack.push(4);
        stack.peek();
        stack.size();
        stack.pop();
        stack.show();
        stack.pop();
        stack.size();
        stack.pop();
        stack.pop();
        stack.size();
    }
}
