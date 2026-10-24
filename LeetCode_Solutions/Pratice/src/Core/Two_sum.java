package Core;

import java.util.Arrays;

public class Two_sum {
	static public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
for (int i = 0; i < nums.length-1; i++) {
	
	int num1 = nums[i];
	int num2 = nums[i+1];
	
	if(num1+num2 == target) {
		result[0] = num1;
		result[1] = num2;
		break;
	}else {
		continue;
		
	}
	
}
return result;
			
			
		}
	public static void main(String[] args) {
		
		int  arr [] = {32,23,2,1,213,21,24,2,};
		System.out.println(Arrays.toString(twoSum(arr, 5)));
		
	}
		
	}



