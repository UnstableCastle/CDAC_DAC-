public class Employee {
	
	private int empId;
	private String empName;
	private float empSal;
	
	public Employee()
	{
		System.out.println("Default Constructor Called");
		empId = 111;
		empName = "Rahul";
		empSal = 64734.89f;
	}
	
	public Employee(int id,String nm,float sal)
	{
		System.out.println("Parameterized Constructor "
				+ "called");
		empId = id;
		empName = nm;
		empSal = sal;
	}
	
	public String toString()
	{
	return "Employee = ["+empId+" "+empName+" "+empSal+"]";
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e);
	Employee e1 = new Employee(222,"Priyanka",75534.89f);
		System.out.println(e1);
	}
}
