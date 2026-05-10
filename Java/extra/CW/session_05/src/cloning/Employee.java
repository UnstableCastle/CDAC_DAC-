package cloning;
public class Employee implements Cloneable{
	private int empId;
	private String empName;
	
	public Employee() {}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ","
				+ " empName=" + empName + "]";
	}
	
	@Override
	protected Object clone() 
			throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) 
			throws CloneNotSupportedException
	{
		Employee e1 = new Employee(111,"Rahul");
		Employee e2 =(Employee) e1.clone();
		System.out.println(e1);
		System.out.println(e2);
	}
}
