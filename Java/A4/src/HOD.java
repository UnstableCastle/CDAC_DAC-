public class HOD extends Teacher {

	private String department;
	
	public HOD() {}
	
	public HOD(String fname,String lname,int age,String subject,String department) {
		super(fname,lname,age,subject);
		this.department=department ;
		
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"HOD [department=" + department + "]";
	}

	public void getDate() {
	super.getData();
	System.out.println("Enter Subject :");
	department = s.next();
		
	}
	
	public void display() {
		super.display();
		System.out.println("Department = ["+department+"]");
		
		
	}
	
	
}
