//package LinkedList;
//
//import java.util.Scanner;
//
//class InNode {
//    private int data;
//    private INode next;
//
//    public InNode(int d) {
//        data = d;
//        next = null;
//    }
//
//    public int getData() {
//        return data;
//    }
//
//    public void setNext(INode n) {
//        next = n;
//    }
//
//    public INode getNext() {
//        return next;
//    }
//}
//
//class CLL1 {
//    private INode last;
//
//    public CLL1() {
//        last = null;
//    }
//
//    public void insertFirst(int d) {
//        INode newNode = new INode(d);
//
//        if (last == null) {
//            last = newNode;
//            last.setNext(last);
//            return;
//        }
//
//        newNode.setNext(last.getNext());
//        last.setNext(newNode);
//    }
//
//    public void insertLast(int d) {
//        INode newNode = new INode(d);
//
//        if (last == null) {
//            last = newNode;
//            last.setNext(last);
//            return;
//        }
//
//        newNode.setNext(last.getNext());
//        last.setNext(newNode);
//        last = newNode;
//    }
//
//    public int deleteFirst() {
//        if (last == null) {
//            System.out.println("List is empty");
//            return -1;
//        }
//
//        INode first = last.getNext();
//        int data = first.getData();
//
//        if (first == last) {
//            last = null;
//        } else {
//            last.setNext(first.getNext());
//        }
//
//        return data;
//    }
//
//    public void display() {
//        if (last == null) {
//            System.out.println("List is empty");
//            return;
//        }
//
//        INode temp = last.getNext();
//
//        do {
//            System.out.print(temp.getData() + " -> ");
//            temp = temp.getNext();
//        } while (temp != last.getNext());
//
//        System.out.println("(back to start)");
//    }
//
//    public void insertAtPos(int d, int pos) {
//        INode newNode = new INode(d);
//
//        if (last == null) {
//            if (pos == 1) {
//                last = newNode;
//                last.setNext(last);
//            } else {
//                System.out.println("Invalid position");
//            }
//            return;
//        }
//
//        if (pos == 1) {
//            newNode.setNext(last.getNext());
//            last.setNext(newNode);
//            return;
//        }
//
//        INode temp = last.getNext();
//        int i = 1;
//
//        while (i < pos - 1 && temp != last) {
//            temp = temp.getNext();
//            i++;
//        }
//
//        if (i < pos - 1) {
//            System.out.println("Invalid position");
//            return;
//        }
//
//        newNode.setNext(temp.getNext());
//        temp.setNext(newNode);
//
//        if (temp == last) {
//            last = newNode;
//        }
//    }
//}
//
//public class MyCLLConcat {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        CLL1 list = new CLL1();
//
//        int choice, value, pos;
//
//        do {
//            System.out.println("\n--- Circular Linked List Menu ---");
//            System.out.println("1. Insert First");
//            System.out.println("2. Insert Last");
//            System.out.println("3. Delete First");
//            System.out.println("4. Display");
//            System.out.println("5. Insert at Position");
//            System.out.println("6. Exit");
//            System.out.print("Enter choice: ");
//            choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter value: ");
//                    value = sc.nextInt();
//                    list.insertFirst(value);
//                    break;
//
//                case 2:
//                    System.out.print("Enter value: ");
//                    value = sc.nextInt();
//                    list.insertLast(value);
//                    break;
//
//                case 3:
//                    int deleted = list.deleteFirst();
//                    if (deleted != -1) {
//                        System.out.println("Deleted: " + deleted);
//                    }
//                    break;
//
//                case 4:
//                    list.display();
//                    break;
//
//                case 5:
//                    System.out.print("Enter value: ");
//                    value = sc.nextInt();
//                    System.out.print("Enter position: ");
//                    pos = sc.nextInt();
//                    list.insertAtPos(value, pos);
//                    break;
//
//                case 6:
//                    System.out.println("Exiting program...");
//                    break;
//
//                default:
//                    System.out.println("Invalid choice!");
//            }
//
//        } while (choice != 6);
//
//        sc.close();
//    }
//}
// 