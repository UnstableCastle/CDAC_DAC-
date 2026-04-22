
public class Employee {
private int empID;
private String empName;
private Date dt_of_joining;

public Employee() {}

public Employee(int empID, String empName, Date dt_of_joining) {
	this.empID = empID;
	this.empName = empName;
	this.dt_of_joining = dt_of_joining;
}

public String toString() {
	return "Employee [empID = " + empID + ", empName = " + empName + ", dt_of_joining = " + dt_of_joining + "]";
}

public static void main(String[] args) {
	Employee e = new Employee(11,"Castle",new Date(9,4,2016));
	System.out.println(e);

}




}
