import java.util.Scanner;
public class Sort_Array {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("enter 10 elements for array");
		for (int i = 0; i < 10; i++) {

			a[i] = s.nextInt();
		}
		System.out.println("Array Elements");
		for (int i = 0; i < 10; i++) {

			System.out.println(a[i]);
		}

		for(int i =0;i<a.length;i++) {
			for(int j = i+1; j < a.length; j++ ) {
				
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
			System.out.println("Sorted Array Elements");
			for (int i1 = 0; i1 < 10; i1++) {

				System.out.println(a[i1]);
			}
			
		}
		}
}