public class Outer3 {
    private int n1;
    private static int n2;

    public Outer3() {
        n1 = 1000;
    }

    static {
        n2 = 2000;
    }

    public static class Inner3 {
    	
    	
        private int n = 1;

        public void get() {
          
            Outer3 o = new Outer3();
            
            System.out.println("n = " + n);
            System.out.println("n1 = " + o.n1);
            System.out.println("n2 = " + n2); 
        }
        
    }

    public static void main(String[] args) {
        Outer3.Inner3 o = new Outer3.Inner3();
        o.get();
    }
}