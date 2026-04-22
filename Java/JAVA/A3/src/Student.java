import java.util.Scanner;
public class Student {
	
	private String name;
	private int rn;
	private int age;
	private double score;
	
	public Student(String name, int rn, int age, double score)
	{
		this.name = name;
		this.rn = rn;
		this.age = age;
		this.score = score;
	}
	
	public double getScore()
	{
		return score;
	}
	
	public String toString()
	{
		return "Roll No : "+rn+"Name : "+name+"age : "+age+"Score : "+score;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Student[] group0to50 = new Student[10];
		Student[] group50to65 = new Student[10];
		Student[] group65to80 = new Student[10];
		Student[] group80to100 = new Student[10];
		
		int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
		
		System.out.println("Enter records for 10 students : ");
		
		for(int i=0; i<10; i++)
		{
			System.out.println("\nStudent "+(i + 1)+":");
			
			System.out.println("Name : ");
			s.nextLine();
			String name = s.nextLine();
			
			System.out.println("Roll no : ");
			int rn = s.nextInt();
			
			System.out.println("Age : ");
			int age = s.nextInt();
			
			double score ;
			while(true)
			{
				System.out.println("Score (0-100) : ");
				score = s.nextDouble();
				
				if(score >= 0 && score <= 100)
				{
					break;
				}
				else 
				{
					System.out.println("Invalid score...");
				}
			}
			
			Student st = new Student(name, rn, age, score);
			
			if(score < 50)
			{
				group0to50[c1++] = st;
			}
			else if(score < 65)
			{
				group50to65[c2++] = st;
			}
			else if(score < 80)
			{
				group65to80[c3++] = st;
			}
			else
			{
				group80to100[c4++] = st;
			}
			
		}
		
		System.out.println("\n=== Students grouped by score ===");
		
		printGroup("Group 0-50 ", group0to50, c1);
		printGroup("Group 50-65 ", group50to65, c2);
		printGroup("Group 65-80 ", group65to80, c3);
		printGroup("Group 80-100 ", group80to100, c4);
		
		s.close();
	}
	public static void printGroup(String groupName, Student[] group, int count)
	{
		System.out.println("\n"+groupName+":");
		
		if(count == 0)
		{
			System.out.println("(no Student in range)");
		}
		else
		{
			for(int i=0;i<count;i++)
			{
				System.out.println(" "+ group[i]);	
			}
		}
	}
}