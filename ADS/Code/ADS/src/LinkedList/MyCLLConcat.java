//package LinkedList;
//
//import java.util.Scanner;
//
//class INode {
//    private int data;
//    private INode next;
//
//    public INode(int d) {
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
//
//    // 🔥 CONCAT METHOD
//    public void concat(CLL1 list2) {
//
//        if (list2.last == null) {
//            return;
//        }
//
//        if (this.last == null) {
//            this.last = list2.last;
//            return;
//        }
//
//        INode head1 = this.last.getNext();
//        INode head2 = list2.last.getNext();
//
//        this.last.setNext(head2);
//        list2.last.setNext(head1);
//
//        this.last = list2.last;
//    }
//}
//
//public class MyCLLConcat {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//       
//
//        CLL1 list1 = new CLL1();
//        CLL1 list2 = new CLL1();
//
//        // List 1
//        list1.insertLast(1);
//        list1.insertLast(2);
//        list1.insertLast(3);
//
//        // List 2
//        list2.insertLast(4);
//        list2.insertLast(5);
//        list2.insertLast(6);
//
//        System.out.print("List1: ");
//        list1.display();
//
//        System.out.print("List2: ");
//        list2.display();
//
//        // Concatenate
//        list1.concat(list2);
//
//        System.out.print("After Concat: ");
//        list1.display();
//    }
//}