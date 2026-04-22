
/**
 *@author Mayuri 
 */
public class Employee {

	/**
	 * empId - Instance variable of type int
	 */
	private int empId;
	private String empName;
	private float empSalary;
	
	/**
	 * Default Constructor - No Args Constr
	 */
	public Employee() {}

	/**
	 * @param empId - is int
	 * @param empName - is String
	 * @param empSalary - is float
	 */
	public Employee(int empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	

	/**
	 * @param empId - its a setter for employeeId
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}


}
