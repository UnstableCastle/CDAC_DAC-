public class Method_Overloading {

    
    public int add(int a, int b) {
        return a + b;
    }

    
    public float add(int a, float b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    //  variable arguments varArgs
    public int add(int... a) {
        int sum = 0;
        for (int num : a) {  
            sum += num;
        }
        return sum;
    }
	 public float add(float a, float b) {
	        return a + b;
	    }
	
	
    public static void main(String[] args) {

        Method_Overloading m = new Method_Overloading();

        System.out.println("Two int: " + m.add(10, 20));            // 30
        System.out.println("Int + float: " + m.add(10, 10.5f));     // 20.5
        System.out.println("Three int: " + m.add(1, 2, 3));         // 6
        System.out.println("Varargs: " + m.add(5, 10, 15, 20));     // 50
    }
}
