package Patterns;

/**
 * Recusion
 */
public class Recusiondemo {

    public static int countdown(int n ){
        if(n == 0){
            System.out.println("Blast Off");
            return 0;
        }
        System.out.println(n);
        return countdown(n-1);

    }
    
    public static void main(String[] args) {
        int n =10;
        System.out.println(countdown(n));
    
    }
} 