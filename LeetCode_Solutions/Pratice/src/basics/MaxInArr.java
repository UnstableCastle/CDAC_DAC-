package basics;

public class MaxInArr {

	public static int maxNumberInArray(int nums[]) {
		
		int maxnum = nums[0];
		
		for(int i = 0; i <nums.length;i++) {
			if(nums[i]> maxnum) {
				maxnum = nums[i];
			}
		}
		
		
		
		return maxnum;
		
	}
	
	public static void main(String[] args) {
		
		int num[]= {23,43,2,4,5,2332,234,1,2,42,121,3};
		System.out.println(maxNumberInArray(num));
	}
}
