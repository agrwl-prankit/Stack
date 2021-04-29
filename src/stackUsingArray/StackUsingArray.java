package stackUsingArray;

public class StackUsingArray {

    int[] stack = new int[5];
    int top = -1;    // to store the index where the last element is present

    // push is used to insert data at last blank position
    public void push(int data){
        if (isFull()){       // check overflow condition
            System.out.println("Array is already full");
            return;
        }
        stack[++top] = data;
        System.out.println(data + " inserted successfully");
    }

    // pop removed the last inserted element
    public void pop(){
        if (isEmpty()){      // check underflow condition
            System.out.println("Stack is already empty");
            return;
        }
        int temp = stack[top];  // store the last inserted element
        stack[top--] = 0;
        System.out.println(temp + " removed successfully");
    }

    // peek simple returns the last inserted element
    public void peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(stack[top] + " is peek element");
    }

    public void show(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        for (int i=0; i<=top; i++) System.out.print(stack[i] + " ");
        System.out.println("");
    }

    public int size(){
        return top + 1;
    }

    private boolean isFull() {
        return top == stack.length-1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
}
