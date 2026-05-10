
public class OneBHK {
protected double roomArea;
protected double hallArea;
protected double price;

public OneBHK() {}

public OneBHK(double ra,double ha,double p) {
	this.hallArea=ha;
	this.roomArea=ra;
	this.price=p;
	
}

public void show() {
	System.out.println("1BHK : ROOM = "+roomArea+" Hall = "+hallArea+" Price = "+price);
}

public double getPPrice() {
	return price;
}
}
