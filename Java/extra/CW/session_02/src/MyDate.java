public class MyDate {
	
	private int dd;//instance variable
	private int mm;
	private int yy;
	
	public void initDate()
	{
		dd=mm=yy=1;
	}
	
	public void setDate(int d,int m,int y)
	{
		dd = d;
		mm = m;
		yy = y;
	}
	
	public void displayDate()
	{
	System.out.println("Date = ["+dd+"/"+mm+"/"+yy+"]");
	}
	
	public static void main(String[] args) {
		MyDate d;//reference variable
		d = new MyDate();//new keyword - object creation
		//MyDate d = new MyDate();
		System.out.println(d.dd);
		d.initDate();
		d.displayDate();
		d.setDate(8, 4, 2026);
		d.displayDate();
		MyDate d1 = new MyDate();
	}
}
