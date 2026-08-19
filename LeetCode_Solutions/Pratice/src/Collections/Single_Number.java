package Collections;

import java.util.HashSet;
import java.util.Set;

public class Single_Number {

public static int singleNumber(int[] nums) {
        
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            if(set.contains(i)){
                set.remove(i);
            }else{
            set.add(i);
        }
        }
        for(int missingNumber: set){
            return missingNumber;
        }
       


        
         return -1;

}

	

	public static void main(String[] args) {
		int[] nums1 = { 2, 2, 1 };
		int[] nums2 = { 4, 1, 2, 1, 2 };

		System.out.println("Test 1 (Should be 1): " + singleNumber(nums1));
		System.out.println("Test 2 (Should be 4): " + singleNumber(nums2));
	}
}
