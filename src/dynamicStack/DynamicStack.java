package dynamicStack;

public class DynamicStack {

    int capacity = 2;
    int[] stack = new int[capacity];
    int top = -1;    // to store the index where the last element is present

    // push is used to insert data at last blank position
    public void push(int data) {
        if (capacity == size()) {
            expand();
        }
        stack[++top] = data;
        System.out.println(data + " inserted successfully");
    }

    // is first stack is full then expand() will increase the length of stack by 2
    private void expand() {
        int length = size();    // get the length of first stack
        int[] newStack = new int[capacity * 2];     // make second stack of length of stack1 length * 2
        System.arraycopy(stack, 0, newStack, 0, length);    // cope the element of stack1 into newStack
        stack = newStack;   // change the reference of stack1 to newStack
        capacity *= 2;  // capacity will also increase
    }

    public int size() {
        return top + 1;
    }
}
