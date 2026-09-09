package basics;

public class isPalindrome {

	public static boolean isPal(String s) {
		int left = 0;
		int right = s.length()-1;
		
		while(left < right) {
			if(s.charAt(right) != s.charAt(left)) {
				return false;
			}
			left++;
			right--;
			}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		String s = "helleh";
		System.out.println(isPal(s));
	}
	
}
