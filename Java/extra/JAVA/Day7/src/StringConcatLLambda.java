
public class StringConcatLLambda {
public static void main(String[] args) {
	StringConcat s = (x,y)->{return x.concat(y);};
	System.out.println(s.strConcat("infoway"," Technologies"));
}
}
