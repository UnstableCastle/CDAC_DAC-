package PREP;

public class reverse_degree {
class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int p = i + 1;
            int rev = 26 - (s.charAt(i) - 'a');
            sum += p * rev;
        }
        return sum;
    }
}
	
}
