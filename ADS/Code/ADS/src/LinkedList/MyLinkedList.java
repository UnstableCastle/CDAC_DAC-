package LinkedList;

import java.util.Scanner;

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

class LinkedList11 {
	private intNode head;

	public LinkedList11() {
		head = null;
	}

	public void makeCycle(int data) {
		if (head == null)
			return;

		intNode temp = head;
		intNode prev = null;
		intNode target = null;

		while (temp != null) {
			if (temp.getData() == data) {
				target = temp;
			}
			prev = temp;
			temp = temp.getNext();
		}

		if (target != null) {
			prev.setNext(target);
		} else {
			System.out.println("Data not found in list");
		}
	}

	public void insertFirst(int d) {
		intNode newNode = new intNode(d);
		newNode.setNext(head);
		head = newNode;
	}

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

	public void insert_at_pos(int value, int pos) {
		if (pos <= 0) {
			System.out.println("Invalid Position!");
			return;
		}

		if (pos == 1) {
			insertFirst(value);
			return;
		}

		intNode new_node = new intNode(value);
		intNode itr = head;

		for (int i = 1; i < pos - 1 && itr != null; i++) {
			itr = itr.getNext();
		}

		if (itr == null) {
			System.out.println("Invalid Position!");
			return;
		}

		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
	}

	public void insert_Sorted(int value) {
		intNode new_node = new intNode(value);

		if (head == null || value < head.getData()) {
			insertFirst(value);
			return;
		}

		intNode itr = head;

		while (itr.getNext() != null && itr.getNext().getData() < value) {
			itr = itr.getNext();
		}

		new_node.setNext(itr.getNext());
		itr.setNext(new_node);
	}

	public void insert_Before(int value, int key) {
		if (head == null) {
			System.out.println("List is empty!");
			return;
		}

		if (head.getData() == key) {
			insertFirst(value);
			return;
		}

		intNode new_node = new intNode(value);
		intNode itr = head;

		while (itr.getNext() != null && itr.getNext().getData() != key) {
			itr = itr.getNext();
		}

		if (itr.getNext() != null) {
			new_node.setNext(itr.getNext());
			itr.setNext(new_node);
		} else {
			System.out.println("INVALID KEY!");
		}
	}

	public void insert_After(int value, int key1) {
		if (head == null) {
			System.out.println("List is empty!");
			return;
		}

		intNode itr = head;

		while (itr != null && itr.getData() != key1) {
			itr = itr.getNext();
		}

		if (itr != null) {
			intNode new_node = new intNode(value);
			new_node.setNext(itr.getNext());
			itr.setNext(new_node);
		} else {
			System.out.println("INVALID KEY!");
		}
	}

	public void display() {
		intNode itr = head;

		while (itr != null) {
			System.out.print(itr.getData() + " -> ");
			itr = itr.getNext();
		}

		System.out.println("null");
	}

	public void swap_alt() {
		intNode itr = head;
		int prev;
		while (itr != null) {
			prev = itr.getData();
			if (itr.getNext() == null)
				break;
			itr.setData(itr.getNext().getData());
			itr.getNext().setData(prev);

			itr = itr.getNext().getNext();

		}
	}

	public void alt() {
		intNode itr = head;

		while (itr != null) {
			System.out.print(itr.getData() + " -> ");

			if (itr.getNext() == null)
				break;

			itr = itr.getNext().getNext();
		}

		System.out.println("null");
	}

	public int deleteFirst() {
		if (head == null)
			return -999;

		int d = head.getData();
		head = head.getNext();
		return d;
	}

	public int deleteLast() {
		if (head == null)
			return -999;

		if (head.getNext() == null) {
			int d = head.getData();
			head = null;
			return d;
		}

		intNode itr = head;

		while (itr.getNext().getNext() != null) {
			itr = itr.getNext();
		}

		int d = itr.getNext().getData();
		itr.setNext(null);
		return d;
	}

	public int del_from_pos(int pos) {
		if (head == null) {
			System.out.println("List is empty");
			return -999;
		}

		if (pos == 1) {
			return deleteFirst();
		}

		intNode itr = head;

		for (int i = 1; i < pos - 1 && itr.getNext() != null; i++) {
			itr = itr.getNext();
		}

		if (itr.getNext() != null) {
			int d = itr.getNext().getData();
			itr.setNext(itr.getNext().getNext());
			return d;
		} else {
			System.out.println("Invalid position");
			return -999;
		}
	}

	public int countElement() {
		int count = 0;
		intNode itr = head;

		while (itr != null) {
			count++;
			itr = itr.getNext();
		}

		return count;
	}

	public int findMiddle() {
		if (head == null)
			return -999;

		intNode slow = head, fast = head;

		while (fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}

		return slow.getData();
	}

	public void reverse() {
		intNode prev = null;
		intNode curr = head;
		intNode next;

		while (curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}

		head = prev;
	}

	private intNode Revll(intNode head) {
		if (head == null || head.getNext() == null)
			return head;

		intNode temp = Revll(head.getNext());
		head.getNext().setNext(head);
		head.setNext(null);

		return temp;
	}

	public void reverseRecursion() {
		head = Revll(head);
	}
}

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedList11 list = new LinkedList11();
		Scanner sc = new Scanner(System.in);

		int choice, value;

		do {
			System.out.println("\n--- Linked List Menu ---");
			System.out.println("1. Insert Element");
			System.out.println("2. Delete Element");
			System.out.println("3. Display");
			System.out.println("4. Count Number of Element");
			System.out.println("5. Find Middle Element");
			System.out.println("6. Reverse List");
			System.out.println("7. Swap Alternate");
			System.out.println("8. Exit");

			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("1. insert first");
				System.out.println("2. insert last");
				System.out.println("3. insert at position");
				System.out.println("4. insert sorted");
				System.out.println("5. insert before");
				System.out.println("6. insert after");

				int ch = sc.nextInt();

				System.out.print("Enter value: ");
				value = sc.nextInt();

				switch (ch) {
				case 1:
					list.insertFirst(value);
					break;
				case 2:
					list.insertLast(value);
					break;
				case 3:
					System.out.print("Enter position: ");
					int pos = sc.nextInt();
					list.insert_at_pos(value, pos);
					break;
				case 4:
					list.insert_Sorted(value);
					break;
				case 5:
					System.out.print("Enter key: ");
					int key = sc.nextInt();
					list.insert_Before(value, key);
					break;
				case 6:
					System.out.print("Enter key: ");
					int key1 = sc.nextInt();
					list.insert_After(value, key1);
					break;
				}
				break;

			case 2:
				System.out.println("1. Delete First");
				System.out.println("2. Delete Last");
				System.out.println("3. Delete from Position");

				int de = sc.nextInt();

				switch (de) {
				case 1:
					System.out.println("Deleted: " + list.deleteFirst());
					break;
				case 2:
					System.out.println("Deleted: " + list.deleteLast());
					break;
				case 3:
					System.out.print("Enter Position: ");
					int pos = sc.nextInt();
					System.out.println("Deleted: " + list.del_from_pos(pos));
					break;
				}
				break;

			case 3:
				System.out.println("1. Display");
				System.out.println("2. Alternate Display");
				System.out.println("3. Reverse (Recursion)");

				int dc = sc.nextInt();

				switch (dc) {
				case 1:
					list.display();
					break;
				case 2:
					list.alt();
					break;
				case 3:
					list.reverseRecursion();
					list.display();
					break;

				}
				break;

			case 4:
				System.out.println("Count: " + list.countElement());
				break;

			case 5:
				System.out.println("Middle: " + list.findMiddle());
				break;

			case 6:
				list.reverse();
				System.out.println("Reversed List:");
				list.display();
				break;
			case 7:
				list.swap_alt();
				list.display();
				break;
			case 8:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 8);

		sc.close();
	}
}
