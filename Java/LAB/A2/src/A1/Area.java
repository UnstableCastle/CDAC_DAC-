package A1;
import java.util.*;

public class Area {
    private int radius;
    private float area;

        public void init(int r) {
        radius = r;
    }

    public float calArea() {
       
        area = (22.0f / 7.0f) * (radius * radius);
        return area;
    }
    
    public void display() {
        System.out.println("Area = [" + area + "]");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Value for Radius :");
        int r = s.nextInt();
        Area a = new Area();
        a.init(r);
        a.calArea(); 
        a.display();        
        s.close(); 
    }
}