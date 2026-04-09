public class Date {
    private int dd;
    private int mm;
    private int yy;

    public Date() {}

    public Date(int dd, int mm, int yy) {
        this.dd = dd; 
        this.mm = mm;
        this.yy = yy;
    }

    public String toString() {
        return dd + "/" + mm + "/" + yy;
    }

    public static void swapDates(Date[] d) {
        System.out.println("\n Inside Swap Method");
        Date temp = d[0];
        d[0] = d[1];
        d[1] = temp;
    }

    public static void main(String[] args) {
        Date[] d = new Date[2];
        Date d1 = new Date(9, 4, 2026);
        Date d2 = new Date(10, 5, 2027);

        d[0] = d1;
        d[1] = d2;

        System.out.println("Before Swap:");
        System.out.println("d[0] " + d[0]);
        System.out.println("d[1] " + d[1]);

        Date.swapDates(d);

        System.out.println("\nAfter Swap:");
        System.out.println("d[0] " + d[0]);
        System.out.println("d[1] " + d[1]);
    }
}