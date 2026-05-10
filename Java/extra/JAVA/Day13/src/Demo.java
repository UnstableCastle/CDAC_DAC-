import java.util.stream.IntStream;

public class Demo {
public static void main(String[] args) {
	Runnable r = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
		int sum = 	IntStream.rangeClosed(1, 10).sum();
		System.out.println("Sum "+sum);
			
			
		}
	};
	
	Runnable r1 = () -> {int sum = 	IntStream.rangeClosed(1, 10).sum();
	System.out.println("Sum "+sum);};
	
	
	
	
	new Thread(r).start();
	new Thread(r1).start();
	
	
	new Thread(()->{int sum = 	IntStream.rangeClosed(1, 10).sum();
	System.out.println("Sum "+sum);}).start();

}

}
