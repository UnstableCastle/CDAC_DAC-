
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

	public void makeCycle(int data) {
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

	public LinkedList11() {
		head = null;
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

	public void display() {
		intNode itr = head;

		while (itr != null) {
			System.out.print(itr.getData() + " -> ");
			itr = itr.getNext();
		}

		System.out.println("null");
	}

	public int deleteFirst() {
		int d = -999;

		if (head == null)
			return d;

		intNode deletable = head;
		d = deletable.getData();
		head = head.getNext();

		deletable.setNext(null);
		deletable = null;

		return d;
	}

	public void insert_at_pos(int value, int pos) {
		intNode new_node = new intNode(value);

		if (pos == 1) {
			insertFirst(value);
			return;
		}

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
		intNode new_node = new intNode(value);

		if (head == null) {
			System.out.println("List is empty!");
			return;
		}

		if (head.getData() == key) {
			insertFirst(value);
			return;
		}

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
		intNode new_node = new intNode(value);

		if (head == null) {
			System.out.println("List is empty!");
			return;
		}

		intNode itr = head;

		while (itr != null && itr.getData() != key1) {
			itr = itr.getNext();
		}

		if (itr != null) {
			new_node.setNext(itr.getNext());
			itr.setNext(new_node);
		} else {
			System.out.println("INVALID KEY!");
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

	public int findMiddle() {
		intNode slow = head, fast = head;
		while (fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow.getData();

	}

	public int deleteLast() {
		int d = -999;
		intNode itr = head;

		if (head.getNext() == null) {
			d = head.getData();
			head = null;
			return d;
		}

		while (itr.getNext().getNext() != null) {
			itr = itr.getNext();
		}
		intNode deletable = itr.getNext();
		d = deletable.getData();
		deletable = null;
		itr.setNext(null);
		return d;
	}

	public int del_from_pos(int pos) {
		int d = -999;

		if (head == null) {
			System.out.println("List is empty");
			return d;
		}

		if (pos == 1) {
			return deleteFirst();
		}

		intNode itr = head;

		for (int i = 1; i < pos - 1 && itr.getNext() != null; i++) {
			itr = itr.getNext();
		}

		if (itr.getNext() != null) {
			intNode deletable = itr.getNext();
			itr.setNext(deletable.getNext());

			d = deletable.getData();

			deletable.setNext(null);
			deletable = null;

			return d;
		} else {
			System.out.println("Invalid position");
			return d;
		}
	}

	public void reverse() {
		{
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
			System.out.println("5. Find Middle Element ");
			System.out.println("6. Reverse List ");
			System.out.println("7. Exit");

			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				int ch;
				System.out.println("select type of insert : ");
				System.out.println("1. insert first ");
				System.out.println("2. insert last ");
				System.out.println("3. insert at a position ");
				System.out.println("4. insert sorted ");
				System.out.println("5. insert before data ");
				System.out.println("6. insert after data ");
				ch = sc.nextInt();

				switch (ch) {
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
					int pos;
					System.out.print("Enter value: ");
					value = sc.nextInt();
					System.out.print("Enter position: ");
					pos = sc.nextInt();
					list.insert_at_pos(value, pos);
					break;

				case 4:
					System.out.print("Enter value: ");
					value = sc.nextInt();
					list.insert_Sorted(value);
					break;

				case 5:
					int key;
					System.out.print("Enter value: ");
					value = sc.nextInt();
					System.out.print("Enter key: ");
					key = sc.nextInt();
					list.insert_Before(value, key);
					break;

				case 6:
					int key1;
					System.out.print("Enter value: ");
					value = sc.nextInt();
					System.out.print("Enter key: ");
					key1 = sc.nextInt();
					list.insert_After(value, key1);
					break;
				}
				break;

			case 2:
				int de;
				System.out.println("Select Delete Operation :");
				System.out.println("1. Delete First :");
				System.out.println("2. Delete Last :");
				System.out.println("3. Delete from Position :");
				de = sc.nextInt();
				switch (de) {
				case 1:
					int deleted = list.deleteFirst();
					if (deleted == -999)
						System.out.println("List is empty!");
					else
						System.out.println("Deleted: " + deleted);
					break;

				case 2:
					list.deleteLast();
					break;

				case 3:
					int pos;
					System.out.println("Enter Position to Delete :");
					pos = sc.nextInt();
					list.del_from_pos(pos);
					break;
				}

				break;

			case 3:
				int dc;
				System.out.println("1. Display Linked List");
				System.out.println("2. Display Alternate Elements");
				dc = sc.nextInt();

				switch (dc) {
				case 1:
					list.display();
					break;

				case 2:
					list.alt();
					break;
				}
				break;

			case 4:
				System.out.println("Number of Elements: " + list.countElement() + "\n");
				break;

			case 5:
				System.out.println("Middle Element of the list: " + list.findMiddle() + "\n");

			case 6:
				System.out.println("Reversed List = ");
				list.reverse();

			case 7:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice!");
			}

		} while (choice != 6);

		sc.close();
	}
}

//     
//        LinkedList11 list = new LinkedList11();
//        Scanner sc = new Scanner(System.in);
//
//        int choice, value;
//
//        do {
//            System.out.println("\n--- Linked List Menu ---");
//            System.out.println("1. Insert First");
//            System.out.println("2. Insert Last");
//            System.out.println("3. Delete First");
//            System.out.println("4. Display");
//            System.out.println("5. Exit");
//            System.out.print("Enter choice: ");
//            choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter value to insert first ");
//                    value = sc.nextInt();
//                    list.insertFirst(value);
//                    break;
//
//                case 2:
//                  
//
//                case 3:
//                    int deleted = list.deleteFirst();
//                    if (deleted != -999)
//                        System.out.println("Deleted: " + deleted);
//                    break;
//
//                case 4:
//                    list.display();
//                    break;
//
//                case 5:
//                    System.out.println("Exiting...");
//                    break;
//
//                default:
//                    System.out.println("Invalid choice!");
//            }
//
//        } while (choice != 5);
//
//        sc.close();
//    }
//}