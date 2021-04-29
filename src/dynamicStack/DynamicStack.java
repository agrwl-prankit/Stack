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

    // pop removed the last inserted element
    public void pop() {
        if (top == -1) {      // check underflow condition
            System.out.println("Stack is already empty");
            return;
        }
        int temp = stack[top];  // store the last inserted element
        stack[top--] = 0;
        shrink();
        System.out.println(temp + " removed successfully");
    }

    // if stack has element less the half of size then it will decrease by 2
    private void shrink() {
        int length = size();
        if (length <= capacity/2) {
            capacity /= 2;
            if (capacity < 2) capacity = 2;
            int[] newStack = new int[capacity];
            System.arraycopy(stack, 0, newStack, 0, length);    // copy the element of stack1 into newStack
            stack = newStack;   // change the reference of stack1 to newStack
        }
    }

    // peek simple returns the last inserted element
    public void peek() {
        System.out.println(stack[top] + " is peek element");
    }

    public void show() {
        for (int i = 0; i <= top; i++) System.out.print(stack[i] + " ");
        System.out.println("");
    }

    public int size() {
        return top + 1;
    }
}
