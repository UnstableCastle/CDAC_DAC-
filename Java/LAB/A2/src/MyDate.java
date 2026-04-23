public class MyDate {
private int dd;
private int mm;
private int yy;


public void initDate() {
	dd=mm=yy=1;
}

public void setDate(int d, int m,int y ) {
	dd= d;
	mm=m;
	yy=y;
	
}

public void display() {
	System.out.println("Date = [ "+dd+" / "+mm+" / "+yy+" ]");
	
}

public static void main(String [] args) {
	
	MyDate m = new MyDate();
	System.out.println(m.dd+" / "+m.mm+" / "+m.yy+".......defualt");
	m.initDate();
	System.out.println(m.dd+" / "+m.mm+" / "+m.yy+".......initDate");
	m.setDate(8, 4, 2026);
	m.display();
	
}

}

