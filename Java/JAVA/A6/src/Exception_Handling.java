
public class Exception_Handling {

	public static void msg() {
		System.out.println("Hello");
	}

	public static void getMsg() {
		msg();
	}

	public static void main(String[] args) {

		int no = 10 / 0;
		System.out.println("no = " + no);
		Exception_Handling.getMsg();
		System.out.println("End of Program");

	}
}
