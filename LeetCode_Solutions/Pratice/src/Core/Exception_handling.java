package Core;

public class Exception_handling {

	
	public static int testm() {
		try {
			System.out.println("inside try");
			return 1;
		}catch(Exception e){
			System.out.println("inside catch");
			return 2;
		}finally {
			System.out.println("inside finally");
			return 3;
		}
	
	}
	public static void main(String[] args) {
		int result = testm();
		System.out.println("method "+ result);
	}
	
}
