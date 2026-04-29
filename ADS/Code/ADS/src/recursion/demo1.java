package recursion;

public class demo1 {

    public static void fun(int n) {

        if (n < 1) {
            System.out.println(n);
            return;
        }

        System.out.println("fun : " + n);

        fun2(n - 1);
    }

    private static void fun2(int n) {

        if (n < 1) {
            System.out.println(n);
            return;
        }

        System.out.println("fun2 : " + n);

        fun(n - 1);
    }

    public static void main(String[] args) {

        fun(100000);
    }
}