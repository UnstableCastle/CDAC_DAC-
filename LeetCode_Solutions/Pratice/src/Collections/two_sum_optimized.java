package Collections;

import java.util.HashMap;
import java.util.Map;

public class two_sum_optimized {

	public static int[] findtwosum(int nums[], int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		
		for(int i=0 ; i<nums.length;i++){	
		int currentNumber = nums[i];
	
		int requiredNumber = target - currentNumber;
		
		if(map.containsKey(requiredNumber)) {
			return new int[]{i,map.get(requiredNumber)};
			
			
		}
		
		map.put(currentNumber,i);
		
				
		
		
		}
		return new int[] {};
		
		
	} 
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = findtwosum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
	}
}
