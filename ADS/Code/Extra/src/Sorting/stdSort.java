package Sorting;

public class stdSort {
	class Student implements Comparable<Student> {
		private int rollno;
		private String name;

		public Student() {
		}

		public Student(int rollno, String name) {
			this.rollno = rollno;
			this.name = name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public String getName() {
			return name;
		}

		public int getRollno() {
			return rollno;
		}

		public String toString() {
			return " Rollno = " + rollno + " Name = " + name;
		}

		@Override
		public int compareTo(Student o) {
			return this.name.compareTo(o.name);
		}
	}

	public static void bubble_sort(Student arr[]) {
		int i, j, flag;
		Student t;

		for (i = arr.length - 1; i >= 0; i--) {
			flag = 0;

			for (j = 0; j < i; j++) {

//				if (arr[j].compareTo(arr[j + 1]) > 0) {
				if (arr[j].getRollno() > arr[j + 1].getRollno()) {
					t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;

					flag = 1;
				}
			}

			if (flag == 0)
				break;
		}
	}

	public static void insertion_Sort(Student[] arr) {
		int i, j;
		Student key;

		for (i = 1; i < arr.length; i++) {
			key = arr[i];

			for (j = i - 1; j >= 0 && key.compareTo(arr[j]) < 0; j--) {
				arr[j + 1] = arr[j];
			}

			arr[j + 1] = key;
		}
	}

	private static void selection_Sort(Student[] arr) {
		int i, j, min;
		Student t;

		for (i = 0; i < arr.length; i++) {
			min = i;

			for (j = i + 1; j < arr.length; j++) {
				if (arr[j].getRollno() < arr[min].getRollno()) {
					min = j;
				}
				
			}

		
				t = arr[i];
				arr[i] = arr[min];
				arr[min] = t;
			}
			
		}
	
	
	public static void main(String[] args) {

		stdSort Student = new stdSort();

		Student s[] = new Student[6];

		s[0] = Student.new Student(6, "Amaan");
		s[1] = Student.new Student(2, "Sagar");
		s[2] = Student.new Student(5, "Shruti");
		s[3] = Student.new Student(1, "Sid");
		s[4] = Student.new Student(4, "Digvijay");
		s[5] = Student.new Student(3, "Aaditya");

//		bubble_sort(s);

//		insertion_Sort(s);
		
		selection_Sort(s);

		for (Student st : s) {
			System.out.println(st);
		}
	}
}
