package session_07;
public class Test1 {	
	public static void main(String[] args) {		
		ArithCal a = new ArithCal() {
			
			@Override
			public void add(int a, int b) {
				System.out.println(a+b);
			}
		};
		
		a.add(10, 20);
		System.out.println(a.getClass());
	}
}
