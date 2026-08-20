package PREP;
import java.util.*;
public class SecondLargestNumber {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int size = sc.nextInt();
	if(size<2) {
		System.out.println(-1);
		sc.close();
		return;
	}
	int arr[] = new int[size];
	for(int i =0; i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	
	int largest=Integer.MIN_VALUE;
	int secondLargest=Integer.MIN_VALUE;
	
	for(int i = 0; i<arr.length;i++) {
	int current = arr[i];
	if(current>largest) {
		secondLargest=largest;
		largest=current;
	}
	else if(current > secondLargest && current !=largest){	
		secondLargest = current;
	
	}
	
	
	
	}
if(secondLargest == Integer.MIN_VALUE) {
	System.out.println(-1);
}else {
	System.out.println(secondLargest);
}	
sc.close();
}


}
