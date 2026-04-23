
public class Bank_C {

	public static void main(String[] args) {
		
		Bank b = new SBI();
		System.out.println("Rate of interest of sbi : "+b.ROI()+"%");
		
		Bank b1 = new IDBI();
		System.out.println("Rate of interest of iDBI : "+b1.ROI()+"%");
		
	}
	
}

