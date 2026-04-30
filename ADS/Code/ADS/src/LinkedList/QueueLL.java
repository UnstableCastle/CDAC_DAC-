
package LinkedList;

public class QueueLL {
    private intNode front; 
    private intNode rear;  

    public QueueLL() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    
    public void add(int data) {
        intNode newNode = new intNode(data);
        
        if (isEmpty()) {
            front = rear = newNode;
            return;
        }
        
        rear.setNext(newNode);
        rear = newNode;
    }

        public int remove() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            return -999;
        }

        int data = front.getData();
        intNode deletable = front;
        
        front = front.getNext();

    
        if (front == null) {
            rear = null;
        }

        deletable.setNext(null); 
        return data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        intNode itr = front;
        System.out.print("Front");
        while (itr != null) {
            System.out.print(" -> " + itr.getData());
            itr = itr.getNext();
        }
        System.out.println(" <- Rear");
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Element at front: " + front.getData());
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();

        q.add(10);
        q.add(20);
        q.add(30);
        q.display();

        q.peek();   
        
        System.out.println("removed: " + q.remove());
        q.display();
    }
}
