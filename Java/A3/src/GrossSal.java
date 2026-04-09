import java.util.Scanner;

public class GrossSal {
    private float basic;
    private float hr;
    private float da;

    public GrossSal() {}

    public GrossSal(float basic, float hr, float da) {
        this.basic = basic;
        this.da = da;
        this.hr = hr;
    }

    public float calSal() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter basic salary: Rs. ");
        basic = s.nextFloat();
        
        float gross = 0;
        
      
        if(basic < 1500) {
            this.hr = (float) (0.10 * basic);
            this.da = (float) (0.90 * basic);
        } 

        else {
            this.hr = 500;
            this.da = (float) (0.98 * basic);
        }
        
       
        gross = basic + this.da + this.hr;
        
        s.close();
        return gross;
    }

    public String toString() {
        return "GrossSal [basic=" + basic + ", hr=" + hr + ", da=" + da + "]";
    }

    public static void main(String[] args) {
       
        GrossSal employee = new GrossSal();
        
      
        float totalSalary = employee.calSal();
        
      
        System.out.println("The Gross Salary is: Rs. " + totalSalary);
        System.out.println(employee.toString());
    }
}