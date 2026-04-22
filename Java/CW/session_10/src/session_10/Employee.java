package session_10;

public class Employee implements Comparable<Employee>{
	
	public int empId;
	public String empName;
	public float empSalary;
	
	public Employee() {}

	public Employee(int empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
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

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		if(this.empId>e.empId)
			return +1;
		else if(this.empId<e.empId)
			return -1;
		else
			return 0;
	}

}
