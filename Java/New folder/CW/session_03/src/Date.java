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
		return "Date [dd=" + dd + ", mm=" + mm + ", "
				+ "yy=" + yy + "]";
	}
	
	/*
	 * public static void swapDates(Date[] d) {
	 * System.out.println("In SwapDates --->"); Date temp; temp = d[0]; d[0] = d[1];
	 * d[1] = temp; } public static void main(String[] args) { Date d[] = new
	 * Date[2]; Date d1 = new Date(9, 4, 2026); Date d2 = new Date(10, 5, 2027);
	 * d[0] = d1; d[1] = d2; System.out.println("Before Swapping--->");
	 * System.out.println("d1 = "+d[0]); System.out.println("d2 = "+d[1]);
	 * Date.swapDates(d); System.out.println("After Swapping--->");
	 * System.out.println("d1 = "+d[0]); System.out.println("d2 = "+d[1]); }
	 */
}
