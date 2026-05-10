
public class Demo1 {

	public static void main(String[] args) {
		int a,b,c=0;
		try {
		a= Integer.parseInt(args[0]);
		b= Integer.parseInt(args[1]);
		
		c = a/b;
		System.out.println("c = "+c);
		
		}catch(Exception e){
			System.out.println();
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
