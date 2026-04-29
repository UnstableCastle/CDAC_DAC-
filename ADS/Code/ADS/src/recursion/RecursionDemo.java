package recursion;

public class RecursionDemo {


    static int sum(int[] a, int i) {
        if (i >= a.length)
            return 0;

        System.out.println(a[i]);
        return a[i] + sum(a, i + 1);
    }

   
    public static int cnt(int n) {
        if (n / 10 == 0) return 1;
        return 1 + cnt(n / 10);
    }

   
    public static int sum_of_digit(int n) {
        if (n / 10 == 0) return n;
        return n % 10 + sum_of_digit(n / 10);
    }

   
    public static void displayR(int n) {
        if (n / 10 == 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n % 10);
        displayR(n / 10);
        
    }

   
    public static int power(int a, int p) {
        if (p == 0) return 1;
        return a * power(a, p - 1);
    }
	
    public static void main(String[] args) {

       
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("Array elements:");
        int total = sum(arr, 0);
        System.out.println("Sum = " + total);

       
        int num1 = 12345;
        System.out.println("\nCount of digits in " + num1 + " = " + cnt(num1));

       
        int num2 = 123;
        System.out.println("\nSum of digits of " + num2 + " = " + sum_of_digit(num2));

        int num3 = 9876;
        System.out.println("\nReverse display of " + num3 + ":");
        displayR(num3);

        
        int a = 3, p = 5;
        System.out.println("\nPower: " + a + "^" + p + " = " + power(a, p));
    }

   
}
