package Infosys.DP;

import java.util.Arrays;
import java.util.Stack;

public class GreatestElement {

	public static int[] nextGreatestNumber(int[] nums) {
		int[] result = new int[nums.length];
		
		Stack<Integer> stack = new Stack<Integer>();
		
		
		for(int i = nums.length-1;i>=0;i--) {
			
			
			while(!stack.isEmpty()&& stack.peek()<=nums[i]) {
			
				stack.pop();
			
			}
		
		result[i]= stack.isEmpty()? -1: stack.peek();
		stack.push(nums[i]);
		
		
		}		
		return result;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,68,4,32,3,5};
		
		System.out.println(Arrays.toString(nextGreatestNumber(arr)));
		
		
	}
	
}
