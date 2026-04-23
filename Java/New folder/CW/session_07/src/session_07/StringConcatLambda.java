package session_07;

public class StringConcatLambda {
	
	public static void main(String[] args) {
		
		StringConcat s = (x,y)->{return x.concat(y);};
System.out.println(s.strConcat("Infoway", " Kothrud"));
	}

}
