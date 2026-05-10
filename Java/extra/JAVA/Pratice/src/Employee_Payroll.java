
public class Employee_Payroll {

	private int empId;
	private String empName;
	private String empDesig;
	private double salary;
	
	public Employee_Payroll() {
		}

	@Override
	public String toString() {
		return "Employee_Payroll [empId=" + empId + ", empName=" + empName + ", empDesig=" + empDesig + ", salary="
				+ salary + "]";
	}

	public Employee_Payroll(int empId, String empName, String empDesig, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesig = empDesig;
		this.salary = salary;
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

	public String getEmpDesig() {
		return empDesig;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
}
