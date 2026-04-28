package LinkedList;

import java.util.Scanner;


class Dnode {
    private int data;
    private Dnode next;
    private Dnode prev;

    public Dnode(int d) {
        data = d;
        next = prev = null;
    }

    public int getData() {
        return data;
    }

    public Dnode getNext() {
        return next;
    }

    public Dnode getPrev() {
        return prev;
    }

    public void setNext(Dnode n) {
        next = n;
    }

    public void setPrev(Dnode p) {
        prev = p;
    }
}


class DLL {
    private Dnode head;

    public DLL() {
        head = null;
    }

   
    public void insertFirst(int d) {
        Dnode newNode = new Dnode(d);

        if (head != null) {
            head.setPrev(newNode);
        }

        newNode.setNext(head);
        head = newNode;
    }

   
    public void insertLast(int d) {
        Dnode newNode = new Dnode(d);

        if (head == null) {
            head = newNode;
            return;
        }

        Dnode itr = head;
        while (itr.getNext() != null) {
            itr = itr.getNext();
        }

        itr.setNext(newNode);
        newNode.setPrev(itr);
    }

   
    public void display() {
        Dnode itr = head;

        while (itr != null) {
            System.out.print(itr.getData() + " <-> ");
            itr = itr.getNext();
        }

        System.out.println("null");
    }

  
    public void displayReverse() {
        if (head == null) return;

        Dnode itr = head;

        while (itr.getNext() != null) {
            itr = itr.getNext();
        }

        while (itr != null) {
            System.out.print(itr.getData() + " <-> ");
            itr = itr.getPrev();
        }

        System.out.println("null");
    }

   
    public int deleteFirst() {
        if (head == null) return -999;

        int data = head.getData();
        head = head.getNext();

        if (head != null) {
            head.setPrev(null);
        }

        return data;
    }

   
    public int deleteLast() {
        if (head == null) return -999;

        if (head.getNext() == null) {
            int data = head.getData();
            head = null;
            return data;
        }

        Dnode itr = head;

        while (itr.getNext() != null) {
            itr = itr.getNext();
        }

        int data = itr.getData();
        itr.getPrev().setNext(null);

        return data;
    }

       public int countElement() {
        int count = 0;
        Dnode itr = head;

        while (itr != null) {
            count++;
            itr = itr.getNext();
        }

        return count;
    }

   
    public int findMiddle() {
        Dnode slow = head, fast = head;

        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        return slow.getData();
    }

   
    public void reverse() {
        Dnode curr = head;
        Dnode temp = null;

        while (curr != null) {
            temp = curr.getPrev();
            curr.setPrev(curr.getNext());
            curr.setNext(temp);
            curr = curr.getPrev();
        }

        if (temp != null) {
            head = temp.getPrev();
        }
    }

   
    public void makeCycle(int data) {
        Dnode temp = head;
        Dnode last = null;
        Dnode target = null;

        while (temp != null) {
            if (temp.getData() == data) {
                target = temp;
            }
            last = temp;
            temp = temp.getNext();
        }

        if (target != null) {
            last.setNext(target);
            target.setPrev(last);

            System.out.println("Cycle created at node: " + data);
        } else {
            System.out.println("Data not found!");
        }
    }
}


public class MyDLL {
    public static void main(String[] args) {

        DLL list = new DLL();
        Scanner sc = new Scanner(System.in);

        int choice, value;

        do {
            System.out.println("\n--- Doubly Linked List Menu ---");
            System.out.println("1. Insert First");
            System.out.println("2. Insert Last");
            System.out.println("3. Delete First");
            System.out.println("4. Delete Last");
            System.out.println("5. Display Forward");
            System.out.println("6. Display Reverse");
            System.out.println("7. Count Elements");
            System.out.println("8. Find Middle");
            System.out.println("9. Reverse List");
            System.out.println("10. Make Cycle");
            System.out.println("11. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    list.insertFirst(value);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    list.insertLast(value);
                    break;

                case 3:
                    System.out.println("Deleted: " + list.deleteFirst());
                    break;

                case 4:
                    System.out.println("Deleted: " + list.deleteLast());
                    break;

                case 5:
                    list.display();
                    break;

                case 6:
                    list.displayReverse();
                    break;

                case 7:
                    System.out.println("Count: " + list.countElement());
                    break;

                case 8:
                    System.out.println("Middle: " + list.findMiddle());
                    break;

                case 9:
                    list.reverse();
                    System.out.println("List Reversed!");
                    break;

                case 10:
                    System.out.print("Enter data to create cycle: ");
                    int d = sc.nextInt();
                    list.makeCycle(d);
                    break;

                case 11:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 11);

        sc.close();
    }
}
