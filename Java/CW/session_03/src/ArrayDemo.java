import java.util.Scanner;
public class ArrayDemo {	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = s.nextInt();
		int[] a = new int[size];
		//int arr[] = {1,2,3,4,5};
		//int ar[] = new int[] {1,1,2,3,4};
		
		System.out.println("Enter any "+size+" elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("Array Elements are: ");
		for(int i:a)
		{
			System.out.println(i);
		}
		s.close();
	}

}
