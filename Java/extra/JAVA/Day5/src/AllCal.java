
public class AllCal extends A implements StaticCal , CompareCal,ArithCal{
	@Override
	public void add(int a , int b ) {
		
		System.out.println("ADD = "+(a+b));
				
	}
	
	@Override
	public void sub(int a , int b ){
		
		System.out.println("Sub = "+(a-b));
				
	}

	@Override
	public int max(int a, int b) {
		
		return (a>b?a:b);
	}

	@Override
	public void avg(int a, int b) {
		
		System.out.println("Avg :"+(a+b)/2);
		
	}
	
public static void main(String[] args) {
	AllCal a = new AllCal();
	
	a.add(1,2);
	a.sub(22, 21);
	System.out.println("Max :"+a.max(12, 10));
	a.avg(12, 20);
	
	System.out.println(ArithCal.n);
	System.out.println(ArithCal.no);
	
	
}
}
