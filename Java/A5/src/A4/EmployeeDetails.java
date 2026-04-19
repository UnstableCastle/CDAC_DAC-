package A4;
class EmployeeDetails {
    int empId;
    String name;
    double salary;

    EmployeeDetails(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + empId + ", Name: " + name + ", Salary: " + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.empId == ((EmployeeDetails) obj).empId)
            return true;
        return false;
    }
    
    public static void main(String[] args) {
		
    	 Taxable t = new Employee(101, "Amaan", 50000);

         t.calcTax();
    	
    	
	}
}
