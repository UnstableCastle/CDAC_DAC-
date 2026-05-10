

public class Outer {

	private int no;
	
	public Outer() {
		no = 100;
	}
	private class Inner{
		private int n;
		
		public Inner() {
			n = 10;
		}
		public void getN() {
			System.out.println("n = "+n);
			System.out.println("no= "+no);
		}
		
//		public static void main(String[] args) {
//			Inner i = new Outer().new Inner();
//    		System.out.println();
//    		i.getN();
//		}
	}
public static void main(String[] args) {
//	Outer o = new Outer();
//	Inner i = new inner();
	
Inner i = new Outer().new Inner();
i.getN();
System.out.println(i.getClass());
}
}
