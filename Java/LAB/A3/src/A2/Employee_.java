package A2;
class Employee_ {
   
    private static int employeeCount = 0;
    private static double totalSalary = 0.0;
    
    private int empNo;
    private double salary;
    
    public Employee_(double salary) {
        this.empNo = ++employeeCount; 
        this.salary = salary;
        totalSalary += this.salary; 
    }
    
    public static void displayCompanyStats() {
        System.out.println("Total Employees created: " + employeeCount);
        System.out.println("Total Salary of all employees: :" + totalSalary);
    }
    
    public void displayEmployeeInfo() {
        System.out.println("Employee No: " + empNo + " | Salary: :" + salary);
    }

    public static void main(String[] args) {
        Employee_ emp1 = new Employee_(5000);
        Employee_ emp2 = new Employee_(6000);
        Employee_ emp3 = new Employee_(1000);
        
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();
        
        System.out.println("-------------------------");
        Employee_.displayCompanyStats();
    }
}
