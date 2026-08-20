package PREP;
import java.util.*;
public class absolutedifference {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		System.out.println("Enter elements :  ");
		for(int i =0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i =0;i<size;i++) {
			if(arr[i]%2==0) {
				evenSum+=arr[i];
			}else {
				oddSum+=arr[i];
			}
		}
		
		int diff = Math.abs(evenSum-oddSum);
		System.out.println(diff);
		
		sc.close();
		
		
		
		
		
		
	}
	
}
