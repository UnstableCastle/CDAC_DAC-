import java.util.LinkedList;

class Student {
	private int rollno;
	private String name;

	// Constructors
	public Student() {
	}

	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	// Getters
	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}

	// toString
	public String toString() {
		return " Rollno = " + rollno + " Name = " + name;
	}
}

// ------------------------------------

class stdNode {
	private Student s;
	private stdNode next;

	// Constructor
	public stdNode(Student s) {
		this.s = s;
		this.next = null;
	}

	// Setters
	public void setS(Student s) {
		this.s = s;
	}

	public void setNext(stdNode next) {
		this.next = next;
	}

	// Getters
	public Student getS() {
		return s;
	}

	public stdNode getNext() {
		return next;
	}

	// Safe toString
	public String toString() {
		return "Student = " + s;
	}
}

// ------------------------------------

class StdListManager {
	private stdNode head;

	// Insert at end
	public void insert(Student s) {
		stdNode newNode = new stdNode(s);

		if (head == null) {
			head = newNode;
			return;
		}

		stdNode iter = head;

		while (iter.getNext() != null) {
			iter = iter.getNext();
		}

		iter.setNext(newNode);
	}

	// Display
	public void display() {
		stdNode iter = head;

		while (iter != null) {
			System.out.println(iter.getS());
			iter = iter.getNext();
		}
	}

	public LinkedList<Student> toLinkedList() {
		LinkedList<Student> temp = new LinkedList<>();

		stdNode iter = head;

		while (iter != null) {
			temp.add(iter.getS());
			iter = iter.getNext();
		}

		return temp;
	}

}

//-----------------

// ------------------------------------

public class StdList {
	public static void main(String[] args) {

		StdListManager list = new StdListManager();
		LinkedList<Student> l1 = new LinkedList<Student>();

		list.insert(new Student(1, "Amaan"));
		list.insert(new Student(2, "Sagar"));
		list.insert(new Student(3, "Shruti"));
		list.insert(new Student(4, "Sid"));
		list.insert(new Student(5, "Digvijay"));
		list.insert(new Student(6, "Aaditya"));

//		list.display();
		l1.addAll(list.toLinkedList());

		LinkedList<Student> st1 = l1.stream().filter(s -> s.getRollno() % 2 == 0).collect(java.util.stream.Collectors.toCollection(LinkedList::new));
		System.out.println(st1);

	}
}
