package basics;

public class missingNum {
public static int missingNumbers(int[] arr) {
	int n = arr.length;
	
	int expectedSum = n*(n+1)/2;
	
	int actualSum = 0;
	
	for(int num:arr) {
		actualSum += num;
	}
	
	
	
	
	return expectedSum-actualSum;
	
}
public static void main(String[] args) {
	int arr[] = {1,3,4,5,6,7,8,9,0};

	System.out.println(missingNumbers(arr));
	
}
}
