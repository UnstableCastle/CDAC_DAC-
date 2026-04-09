public class Employee {
	private int empId;
	private String empName;
	private float empSal;

	public Employee() {
		System.out.println("Default Constructor");
		empId = 1;
		empName = "EMPNAME";
		empSal = 999999;

	}

	public Employee(int id, String nm, float sal) {
		System.out.println("Para Constructor");
		empId = id;
		empName = nm;
		empSal = sal;

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	public static void main(String[] args) {
		Employee e = new Employee(1,"CASTLE",123456.78f);
		System.out.println(e);

	}

}
