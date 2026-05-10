import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30);

         int[] sum = {0}; 

        list.forEach(x -> {
            if (x % 2 == 0) {
                sum[0] += x * 2;
            }
        });

        System.out.println("sum = " + sum[0]);
    
        Function<Integer, Double> f = (a) -> Math.sqrt(a);
        	System.out.println(f.apply(64));
        	
        	
        	Function<String,String> f1 = (a) -> a.toLowerCase()+" "+a.toUpperCase();
        	System.out.println(f1.apply("UnstableCastle"));	
    
        	Function<String,Integer> f2 = (a) -> a.length();
        	System.out.println(f2.apply("UnstableCastle"));	
        	
    }
}