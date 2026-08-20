package PREP;

import java.util.Arrays;

public class moveZeroes {

	public static void moveZeroes(int[] nums) {
	
	int ip = 0;
	
	for(int i =0;i <nums.length;i++) {
		if(nums[i]!=0) {
			nums[ip]=nums[i];
			ip++;
		}
		
	}
		
	while(ip<nums.length) {
		nums[ip] =0;
		ip++;
	}
		
		
		
		
		
	}
	public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println("Result: " + Arrays.toString(nums));
	
}
}
