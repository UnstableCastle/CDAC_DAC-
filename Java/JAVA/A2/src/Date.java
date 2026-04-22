public class Date {
// with Accessor And Mutators
private int day;
private int month;
private int year;

public void setDay(int d) {
	day =d;
	
}
public void setMonth(int m) {
	month=m;
	
}
public void setYear(int y) {
	year =y;
	
}

public int getDay() {
return day;
}

public int getMonth() {
return month;
}

public int getYear() {
return year;
}

public static void main(String[]args) {
	Date d = new Date();
	d.setDay(9);
	d.setMonth(3);
	d.setYear(2002);
	
	System.out.println("Date "+d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
}


}
