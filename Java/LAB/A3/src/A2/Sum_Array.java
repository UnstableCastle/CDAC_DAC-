package A2;
import java.util.Scanner;

public class Sum_Array {

	public static int sum_array(int a[]) {

		int sum = 0;
		for (int num : a) {
			sum += num;
		}
		int avg = sum / 10;
		System.out.println("Avg = " + avg);
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("enter 10 elements for array");
		for (int i = 0; i < 10; i++) {

			a[i] = s.nextInt();
		}
		System.out.println("Sum =" + sum_array(a));
	}

}
