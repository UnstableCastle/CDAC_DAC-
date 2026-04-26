package Queue;

import java.util.Scanner;

class intCircularQueue {
    private int arr[];
    private int front;
    private int rear;

    public intCircularQueue() {
        arr = new int[10];
        front = rear = -1;
    }

    public intCircularQueue(int s) {
        arr = new int[s];
        front = rear = -1;
    }

    public boolean isFull() {
        return ((front == 0 && rear == arr.length - 1) || (front == rear + 1));
    }

    public boolean isEmpty() {
        return (front == -1);
    }

    public void insertQ(int d) {
        if (isFull()) {
            System.out.println("Queue is Full !!! : [ Overflow ]");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        if (rear == arr.length - 1) {
            rear = 0;
        } else {
            rear = rear + 1;
        }

        arr[rear] = d;
        System.out.println("Inserted: " + d);
    }

    public int removeQ() {
        int d = -999;

        if (isEmpty()) {
            System.out.println("Queue is Empty !!! : [ Underflow ]");
            return d;
        }

        d = arr[front];

        if (front == rear) {
            front = rear = -1;
        } else if (front == arr.length - 1) {
            front = 0;
        } else {
            front = front + 1;
        }

        return d;
    }

    public int peek() {
        int d = -999;

        if (isEmpty()) {
            System.out.println("Queue is Empty !!! : [ Underflow ]");
            return d;
        }

        return arr[front];
    }

  
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue elements: ");

        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % arr.length;
        }

        System.out.println();
    }
}



public class CircularQueue {

    public static void main(String[] args) {
        int num, n;
        char ch;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length for Queue :");
        n = s.nextInt();

        intCircularQueue q = new intCircularQueue(n);

        do {
            System.out.println("\nEnter Choice ");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            ch = s.next().charAt(0);

            switch (ch) {

            case '1':
                System.out.println("Enter Number to Insert:");
                num = s.nextInt();
                q.insertQ(num);
                break;

            case '2':
                num = q.removeQ();
                if (num != -999) {
                    System.out.println("Element removed: " + num);
                }
                break;

            case '3':
                num = q.peek();
                if (num != -999) {
                    System.out.println("Front element: " + num);
                }
                break;

            case '4':
                q.display();
                break;

            case '5':
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice!");
            }

        } while (ch != '5');

        s.close();
    }
}
