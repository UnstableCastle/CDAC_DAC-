package Collections;

import java.util.HashMap;
import java.util.Map;

public class firstUniqChar {
	class Solution {
	    public int firstUniqChar(String s) {
	        Map<Character,Integer> map = new HashMap<Character,Integer>();
	        for(char c: s.toCharArray()){
	            map.put(c,map.getOrDefault(c,0)+1);
	        }
	        for(int i=0;i<s.length();i++){
	            char c = s.charAt(i);
	            
	           int count = map.get(c);
	           if(count==1) {
	        	   return i;
	           }
	        }
			return -1;
	    }
	}
}
