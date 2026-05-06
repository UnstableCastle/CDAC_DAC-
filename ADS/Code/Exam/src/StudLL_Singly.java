
public class StudLL_Singly {
	private StudNode head;

	public StudLL_Singly(StudNode head) {
		super();
		this.head = head;
	}

//==================================================
	@Override
	public String toString() {
		return "StudLL_Singly [head=" + head + "]";
	}

	public StudNode getHead() {
		return head;
	}

	public void setHead(StudNode head) {
		this.head = head;
	}

//=================================================
	public void insertFirst(Student s) {
		StudNode new_node = new StudNode(s);
		if (head == null) {
			head = new_node;
			return;
		}
		new_node.setNext(head);
		head = new_node;

	}

//===============================================
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

//===============================================
	public StudNode deleteFirst() {

		if (head == null) {
			System.out.println("empty");
			return head;
		}
		StudNode temp = head;
		head = head.getNext();

		return temp;
	}

//==============================================
	public StudNode deleteLast() {

		
		
		// empty list
		if (head == null) {
			System.out.println("Empty");
			return null;
		}
		// One Element
		if (head.getNext() == null) {
			StudNode temp = head;
			head = null;
			return temp;

		}
		// iterator
		StudNode iter = head;
		while (iter.getNext().getNext() != null) {

			iter = iter.getNext();

		}

		StudNode temp = iter.getS();
		iter.setNext(null);

		return temp;
	}

//===============================================

	public void display() {

		StudNode iter = head;
		while (iter != null) {
			System.out.println(iter.getS());
			iter = iter.getNext();
		}

	}
//===============================================
	
	public void search(int rollNo) {

	    StudNode iter = head;

	    while (iter != null) {
	        if (iter.getS().getRollno() == rollNo) {
	            System.out.println("Found: " + iter.getS());
	            return;
	        }
	        iter = iter.getNext();
	    }

	    System.out.println("Not found");
	}
	
	
//===============================================
	public static void main(String[] args) {

		StudLL_Singly list = new StudLL_Singly(null);
		Student s1 = new Student(1, "Amaan", 19, 18, 20);
		Student s2 = new Student(2, "Rahul", 18, 17, 16);
		Student s3 = new Student(3, "Sneha", 17, 16, 19);

		list.insertFirst(s1);
		list.insertLast(s2);
		list.insertLast(s3);
		System.out.println();
		list.display();
		list.deleteFirst();
		System.out.println();
		list.display();
		list.search(1);

	}
}
