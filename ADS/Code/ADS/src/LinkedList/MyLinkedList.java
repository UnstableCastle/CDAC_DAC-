package LinkedList;

class intNode {
    private int data;
    private intNode next;

    
    public intNode(int d) {
        data = d;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int d) {
        data = d;
    }

    public intNode getNext() {
        return next;
    }

    public void setNext(intNode n) {
        next = n;
    }
}

class LinkedList {
    private intNode head;

    // Constructor
    public LinkedList() {
        head = null;
    }

    // Insert at first
    public void insertFirst(int d) {
        intNode newNode = new intNode(d);

        newNode.setNext(head);
        head = newNode;
    }

    // Insert at last
    public void insertLast(int d) {
        intNode newNode = new intNode(d);

        if (head == null) {
            head = newNode;
            return;
        }

        intNode itr = head;
        while (itr.getNext() != null) {
            itr = itr.getNext();
        }

        itr.setNext(newNode);
    }

    
    public void display() {
        intNode itr = head;

        while (itr != null) {
            System.out.print(itr.getData() + " -> ");
            itr = itr.getNext();
        }

        System.out.println("null");
    }

    // Delete first
    public int deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -999;
        }

        int data = head.getData();
        head = head.getNext();
        return data;
    }
}

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertLast(30);

        list.display();  

        list.deleteFirst();

        list.display();   
    }
}
