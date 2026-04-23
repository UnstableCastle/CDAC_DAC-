

public class Outer2 {
	private int n;

	public Outer2() {
		n = 1234;
	}

	public void get() {

		int n = 4568;
		class Inner2 {
			int n;

			public Inner2() {
			 n = 9101112;
			}

			public int getN(int n) {//public int getN() {
				System.out.println("n = "+Outer2.this.n);
				return n;

			
			}
			
		}
		
		
Inner2 i = new Inner2();

System.out.println("n = "+i.getN(i.n));
System.out.println("n = "+i.getN(n));
System.out.println(i.getClass());




	}
public static void main(String[] args) {
	Outer2 o = new Outer2();
	
o.get();
	
}
}


