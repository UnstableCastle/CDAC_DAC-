package A3;
import java.util.Scanner;

public class Floor {
private int length;
private int width;

public Floor() {}

public Floor(int len, int wid) {
	this.length=len;
	this.width=wid;
	
}

public double TotalTiles(Tile t) {
	int floorArea = length*width;
	int tileArea = t.getEdge()*t.getEdge();
	return floorArea/tileArea;
}


public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter the Length and Breadth : ");
	int len = s.nextInt();
	int wid = s.nextInt();
	
	System.out.println("Enter tile edge :");
	int edge = s.nextInt();
	
	Floor f = new Floor(len,wid);
	Tile t = new Tile(edge);
	
	double total = f.TotalTiles(t);
	System.out.println("No of tiles required :  "+total);
	
	
}

}
