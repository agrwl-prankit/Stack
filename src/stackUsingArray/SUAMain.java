package stackUsingArray;

public class SUAMain {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("size of stack is: " + stack.size());
        stack.show();
        stack.pop();
        stack.show();
        System.out.println("size of stack is: " + stack.size());
        stack.peek();
    }
}
