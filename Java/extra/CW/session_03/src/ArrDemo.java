import java.util.Scanner;
public class ArrDemo {	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//int arr[][] = new int[2][];//jagged Array
		int arr[][] = new int[2][3];
		//int [][]a = {{1,2},{2,3,4},{4,5,6,4}};
		//int[][] ar = new int[][] {{1,2},{2,3,4}};
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			System.out.println("Enter "+(j+1)+" element:");
				arr[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Array Elements :");
		for(int i[]:arr)
		{
			for(int j:i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}

}
