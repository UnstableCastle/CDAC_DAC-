package A4;
import java.util.Scanner;

public class School {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student std[] = new Student[5];
		
		for(int i=0;i<3;i++) {
			System.out.println("Enter School Student Details \n");
			System.out.println("Enter Student Rollno: ");
			int rollNo = s.nextInt();
			System.out.println("Enter Percentage :");
			double percentage = s.nextDouble();
			System.out.println("Enter Class : ");
			String className = s.next();
			
		std[i] = new SchoolStudent(className,rollNo,percentage);		
		}
		
		
		for(int i=3;i<5;i++) {
			System.out.println("Enter College Student Details \n");
			System.out.println("Enter Student Rollno: ");
			int rollNo = s.nextInt();
			System.out.println("Enter Percentage :");
			double percentage = s.nextDouble();
			System.out.println("Enter Semister : ");
			int semister = s.nextInt();
			
		std[i] = new CollegeStudent(rollNo,percentage,semister);		
		}
		
		for(int i=0;i<std.length;i++) {
		System.out.println(std[i]);
		}
		
		 System.out.print("Enter roll number to search: ");
	        int r = s.nextInt();

	        for (Student s1 : std) {
	            if (s1.rollNo == r) {
	                if (s1 instanceof SchoolStudent)
	                    System.out.println("It is a School Student");
	                else if (s1 instanceof CollegeStudent)
	                    System.out.println("It is a College Student");
	            }
	        }

	     
	        int count = 0;
	        for (Student sts : std) {
	            if (sts.percentage > 75)
	                count++;
	        }

	        System.out.println("Students with A grade: " + count);
		
		
		
	}

}
