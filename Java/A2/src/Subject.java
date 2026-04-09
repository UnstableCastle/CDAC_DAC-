import java.util.Scanner;

class Subject {
    int[] sub = new int[5];

 
    Subject(int a, int b, int c, int d, int e) {
        sub[0] = a;
        sub[1] = b;
        sub[2] = c;
        sub[3] = d;
        sub[4] = e;
    }

    int getSub(int i) {
        return sub[i];
    }

    void setSub(int i, int val) {
        sub[i] = val;
    }

    int sum() {
        int s = 0;
        for (int i = 0; i < 5; i++) {
            s = s + sub[i];
        }
        return s;
    }

    float per() {
        return (sum() / 500.0f) * 100;
    }


   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        Subject s = new Subject(a, b, c, d, e);

        System.out.println("\nMarks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + s.getSub(i));
        }

        System.out.println("Total = " + s.sum());
        System.out.println("Percentage = " + s.per());

        System.out.println("\nAfter Update:");
        System.out.println("Total = " + s.sum());
        System.out.println("Percentage = " + s.per());

        sc.close();
    }
}
