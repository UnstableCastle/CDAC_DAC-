package Collections;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> s1 = new HashSet<Integer>();
        for(int i : nums){
        if(s1.contains(i)){
            return true;
        }else{
            s1.add(i);
        
        }
        
        }
        return false;

    }
    
    public static void main(String[] args) {
		int nums[]= {1,2,3,2,4,1,2,3,4,3,2};
		System.out.println(containsDuplicate(nums));
	}
}