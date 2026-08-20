package Collections;

import java.util.HashMap;
import java.util.Map;

public class containsNearbyDuplicate {
	class Solution {
	    public boolean containsNearbyDuplicate(int[] nums, int k) {
	     Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	     for(int i =0; i< nums.length;i++){
	        int currentNum = nums[i];
	      

	            if(map.containsKey(currentNum)){
	                int oldIndex = map.get(currentNum);
	            
	            if(i-oldIndex <= k){
	                return true;
	            }
	        
	            } 
	            map.put(currentNum,i);
	          
	     }
	return false;
	    }
	    
	}
}
