import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Product {
private int pid;
private String name;
private Double price;
public Product() {}



public Product(int pid, String name, Double price) {
	super();
	this.pid = pid;
	this.name = name;
	this.price = price;
}



public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}


@Override
public String toString() {
	return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
}



public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
Map<Integer, Product> h  = new HashMap<Integer, Product>();

h.put(1, new Product(1,"cake",120d));
h.put(2, new Product(2,"ice-cream",120d));
h.put(3, new Product(3,"Kurkure",20d));
h.put(4, new Product(4,"Lays",20d));
h.put(5, new Product(5,"GoodDay",120d));

System.out.println(h);

System.out.println("How many products you want to enter");
int n  = s.nextInt();

for(int i = 6; i<=(6+n);i++) {

	System.out.println("Enter Product id :");
	int pid  = s.nextInt();
	System.out.println("Enter Product name :");
	String name = s.next();
	System.out.println("Enter Price of Product :");
	double price = s.nextDouble();
	
	
	h.put(i+1,new Product(pid,name,price));
}
	
	









}





}
