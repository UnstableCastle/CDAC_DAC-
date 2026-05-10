public class Date {	
	private int day;
	private int month;
	private int year;
	
	public void setDay(int d)
	{
		day = d;
	}
	
	public int getDay()
	{
		return day;
	}
	//generate getters and setters for month and year
	public static void main(String[] args) {
		Date d = new Date();
		d.setDay(6);
		//int day = d.getDay();
		//System.out.println("Day = "+day);
		System.out.println("Day = "+d.getDay());
	}
}
