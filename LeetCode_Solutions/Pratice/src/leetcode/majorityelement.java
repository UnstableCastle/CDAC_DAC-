package leetcode;

import java.util.HashMap;
import java.util.Map;

public class majorityelement {

	class Solution {
	    public int majorityElement(int[] nums) {
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

	        for(int i : nums){
	            map.put(i,map.getOrDefault(i,0)+1);
	        }
	        int majorityTarget = nums.length/2;

	        for(int i:map.keySet()){
	            
	            int count = map.get(i); 

	            if(count>majorityTarget){
	                return i;
	            }
	        }
	        return -1;
	    }
	}
	
}
