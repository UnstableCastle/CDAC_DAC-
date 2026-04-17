/**
 * Represents an Employee entity with basic details such as ID, name, and salary.
 * * @author CASTLE
 */
public class Employee {

    /**
     * The unique identifier for the Employee.
     */
    private int empId;

    /**
     * The name of the Employee.
     */
    private String name;

    /**
     * The salary of the Employee.
     */
    private float salary;

    /**
     * Constructs a new Employee with the specified details.
     * * @param empId  The unique identifier for the employee.
     * @param name   The name of the employee.
     * @param salary The salary of the employee.
     */
    public Employee(int empId, String name, float salary) {
        super();
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Returns a string representation of the Employee object.
     * * @return A string containing the employee's ID, name, and salary.
     */
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
    }

    /**
     * Gets the unique ID of the employee.
     * * @return The employee's ID.
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * Sets the unique ID of the employee.
     * * @param empId The new ID to assign to the employee.
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /**
     * Gets the name of the employee.
     * * @return The employee's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the employee.
     * * @param name The new name to assign to the employee.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the salary of the employee.
     * * @return The employee's salary.
     */
    public float getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee.
     * * @param salary The new salary to assign to the employee.
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }
}