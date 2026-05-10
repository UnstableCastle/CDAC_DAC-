package A4;

class Factorial extends Processor {

	Factorial(int data) {
		super(data);
	}

	void process() {
		int fact = 1;
		for (int i = 1; i <= data; i++) {
			fact *= i;
		}
		 System.out.println("Factorial: " + fact);

	}
public static void main(String[] args) {
	
	
	 
      Processor c = new Factorial(3);
		c.showData();
		c.process();
	
}
	
}