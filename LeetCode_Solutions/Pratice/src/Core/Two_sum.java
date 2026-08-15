package Core;

public class Two_sum {
public int[] two_sum(int nums[],int target) {
		for(int i =0; i < nums.length;i++){
			
			for(int j = i+1 ; j<nums.length;j++) { 
		
				if(nums[i]+nums[j]==target) {
				return new int[] {i,j};
				}
			}
		}
		return new int[] {};
		
		}
				
public static void main(String[] args) {
	Two_sum sum = new Two_sum();
		int nums[] = {2,15,7,11};
		int[] result = sum.two_sum(nums, 9); 
	
		System.out.println("[" + result[0] + ", " + result[1] + "]");
	
}
}
