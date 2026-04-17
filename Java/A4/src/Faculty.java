public class Faculty {

    protected int facultyid;
    protected double sal;

    public Faculty() {}

    public Faculty(int facultyid) {
        this.facultyid = facultyid;
    }

    @Override
    public String toString() {
        return "Faculty [facultyid=" + facultyid + ", sal=" + sal + "]";
    }

    public int getFacultyid() {
        return facultyid;
    }

    public double getSalary() {
        return sal;
    }
}