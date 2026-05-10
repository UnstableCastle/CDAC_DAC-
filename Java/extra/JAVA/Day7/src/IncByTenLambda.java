
public class IncByTenLambda {

	public static void main(String[] args) {
		IncrementByTen i = (a)->{return(a+10);};
	System.out.println(i.incrementByTen(5));
	System.out.println(i.incrementByTen(7));
	}
}
