package Core;

public class Car {
String model;
int year;


public Car(String model,int year) {
	this.year=year;
	this.model=model;
}

@Override
public String toString() {
	return "["+this.model+" "+this.year+"]";
	
}

public static void main(String[] args) {
	Car c = new Car("toyota",2022);
	System.out.println(c);
}

}
