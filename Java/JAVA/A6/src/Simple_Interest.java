
public class Simple_Interest {

	public static void main(String[] args) {
		int P,N,R;
		float SI;
		try {
		P= Integer.parseInt(args[0]);//100
		N= Integer.parseInt(args[1]);//12
		R= Integer.parseInt(args[2]);//2
		 
		SI = (float)(P*N*R)/100;
		
		System.out.println("SI = "+SI);//24
		
		}catch(Exception e){
			System.out.println();
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
