package PREP;
import java.util.*;
public class MissingNumber {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int arr[] = new int[n];
	
	for(int i =0 ; i<n-1;i++) {
		arr[i] = sc.nextInt();	
		}

	int esum = n*(n+1)/2;
	
	int asum = 0;
	
	for(int i =0 ; i<n-1;i++) {
		asum+=arr[i];
	}
			
	int result = Math.abs(esum-asum);
	System.out.println(result);
	sc.close();
	
}
}
