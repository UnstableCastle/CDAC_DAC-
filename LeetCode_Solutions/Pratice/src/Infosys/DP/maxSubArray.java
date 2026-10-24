package Infosys.DP;

public class maxSubArray {
public static int maxSubArrSum(int[] nums, int k ) {
	int windowsum =0;
	int maxsum = 0;
	
	for(int i =0; i <k;i++) {
		windowsum += nums[i];
		
	}
	maxsum = windowsum;
	
	for (int i = 0; i < nums.length-k; i++) {
		windowsum = windowsum+nums[i+k] - nums[i];
		maxsum = Math.max(maxsum, windowsum);
	}
	return maxsum;
}

public static void main(String[] args) {
	int arr[]= {1,23,42,324,31,42,4,32};
	int k = 4;
	System.out.println(maxSubArrSum(arr, k));
}
}
