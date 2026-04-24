public class MyStack {
    private int top;
    private int arr[];

    public MyStack(int size) {
        this.top = -1;
        this.arr = new int[size];   
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int num) {
        if (isFull()) {
            System.out.println("Stack is Full Overflow!!!");
        } else {
            arr[++top] = num;
            System.out.println("Element " + num + " inserted");
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return '*';
        } else {
            int d = arr[top--];
            System.out.println("Element " + d + " deleted");
            return '*';   
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            System.out.println("Element at Top = " + arr[top]);
            return arr[top];          }
    }
}
