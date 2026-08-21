package PREP;
import java.util.*;
public class CountPairs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int K = sc.nextInt();
		
		int count = 0; 
		
		for(int i = 0; i<arr.length;i++) {
			
			for(int j = i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==K) {
					count++;
				}
				
				
				
			}
			
		}
		System.out.println(count);
	}
	
}
