import java.util.*;


class MyStack {
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

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int d = arr[top--];
            System.out.println("Element " + d + " deleted");
            return 0;   
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



public class StackDemo {

	public static void main(String[] args) {
		int num;
		char ch;
		MyStack st = new MyStack(8);
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Enter Choice ");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Exit");
			ch = s.next().charAt(0);

			switch (ch) {
			case '1':
				System.out.println("Enter Number to Push :");
				num = s.nextInt();
				st.push(num);
				break;
			case '2':
				num = st.pop();
				if (num == -999) {
					System.out.println("element removed " + num);
				}
				break;

			case '3':
				st.peek();
				break;
			case '4':
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}

		} while (ch != '4');
		
		
		
		

	s.close();
	}
}
