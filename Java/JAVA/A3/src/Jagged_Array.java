import java.util.Scanner;

public class Jagged_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		int row = s.nextInt();
		int arr[][] = new int[row][];
		
		for(int i = 0 ; i<row;i++) {
			System.out.println("Enter number of cols");
			int cols = s.nextInt();
			arr[i] = new int[cols];
			for(int j =0;j<cols;j++) {
				
				System.out.println("Enter Array elements");
				arr[i][j]= s.nextInt();
			}
			}
		
		System.out.println("Array elements \n");
		for(int i[]:arr) {
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println("");
		}
		
		s.close();
		
		
		
	}
}
