public class StudLL_Singly {
	private StudNode head;

	
	
	public StudNode getHead() {
		return head;
	}

	public void setHead(StudNode head) {
		this.head = head;
	}

	// Empty constructor
	public StudLL_Singly() {
		head = null;
	}

	// ================= INSERT =================

	public void insertFirst(Student s) {
		StudNode new_node = new StudNode(s);
		new_node.setNext(head);
		head = new_node;
	}

	public void insertLast(Student s) {
		StudNode new_node = new StudNode(s);

		if (head == null) {
			head = new_node;
			return;
		}

		StudNode iter = head;
		while (iter.getNext() != null) {
			iter = iter.getNext();
		}

		iter.setNext(new_node);
	}

	// ================= DELETE =================

	public StudNode deleteFirst() {
		if (head == null) {
			System.out.println("Empty");
			return null;
		}

		StudNode temp = head;
		head = head.getNext();
		return temp;
	}

	public StudNode deleteLast() {
		if (head == null) {
			System.out.println("Empty");
			return null;
		}

		if (head.getNext() == null) {
			StudNode temp = head;
			head = null;
			return temp;
		}

		StudNode iter = head;
		while (iter.getNext().getNext() != null) {
			iter = iter.getNext();
		}

		StudNode temp = iter.getNext();
		iter.setNext(null);
		return temp;
	}

	// ================= DISPLAY =================

	public void display() {
		StudNode iter = head;
		while (iter != null) {
			System.out.println(iter.getS());
			iter = iter.getNext();
		}
	}

	// ================= SEARCH =================

	public StudNode search(int rollNo) {
		StudNode iter = head;

		while (iter != null) {
			if (iter.getS().getRollno() == rollNo) {
				return iter;
			}
			iter = iter.getNext();
		}

		return null;
	}

	//===================Merge 2 LL ====================
	public static void mergeLL(StudLL_Singly l1,StudLL_Singly l2,StudLL_Singly l3) {
		
		StudNode iter1 = l1.getHead();
		StudNode iter2 =l2.getHead();
		
		while(iter1!=null && iter2!=null) {
			l3.insertLast(iter1.getS());
			l3.insertLast(iter2.getS());
			iter1= iter1.getNext();
			iter2 = iter2.getNext();
			
		}
		while(iter1!=null) {
			l3.insertLast(iter1.getS());
			iter1 = iter1.getNext();
		}
		
		while(iter2!=null) {
			l3.insertLast(iter2.getS());
			iter2 = iter2.getNext();
		}
		return;
		
	}
	
	
	
	// ================= MAIN =================

	public static void main(String[] args) {

		StudLL_Singly list = new StudLL_Singly();
		StudLL_Singly list2 = new StudLL_Singly();
		StudLL_Singly list3 = new StudLL_Singly();

		Student s1 = new Student(1, "Amaan", 19, 18, 20);
		Student s2 = new Student(2, "Rahul", 18, 17, 16);
		Student s3 = new Student(3, "Sneha", 17, 16, 19);

		Student s4 = new Student(1, "Sagar", 19, 18, 20);
		Student s5 = new Student(2, "Shruti", 18, 17, 16);
		Student s6 = new Student(3, "Sid", 17, 16, 19);

		
		// Insert
		list.insertFirst(s1);
		list.insertLast(s2);
		list.insertLast(s3);
		
		list2.insertFirst(s4);
		list2.insertLast(s5);
		list2.insertLast(s6);

//		System.out.println("Initial List:");
		mergeLL(list, list2, list3);
		list.display();
		System.out.println();
		list2.display();
		System.out.println("merged L1 ,L2,L3");
		list3.display();
		

		// Delete first
//        list.deleteFirst();
//        System.out.println("\nAfter deleteFirst:");
//        list.display();

		// Delete last
//        list.deleteLast();
//        System.out.println("\nAfter deleteLast:");
//        list.display();

		// Search
//		StudNode result = list.search(2);
//		if (result != null) {
//			System.out.println("\nFound: " + result);
//		} else {
//			System.out.println("\nNot found");
//		}
	}
}