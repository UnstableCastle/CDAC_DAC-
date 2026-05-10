
public class Employee {
private int empId;
private String name;
private int sal;

public Employee() {}
	
public Employee(int empId,String name,int sal) {
this.empId = empId;
this.name = name;
this.sal=sal;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSal() {
	return sal;
}

public void setSal(int sal) {
	this.sal = sal;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", sal=" + sal + "]";
}

}
