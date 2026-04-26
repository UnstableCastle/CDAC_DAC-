public class MyStackChar {
    private int top;
    private char arr[];

    public MyStackChar(int size) {
        this.top = -1;
        this.arr = new char[size];   
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char n) {
        if (isFull()) {
            System.out.println("Stack is Full Overflow!!!");
        } else {
            arr[++top] = n;
            System.out.println("Element " + (char)n + " inserted");
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return '*';
        } else {
            char d = arr[top--];
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
