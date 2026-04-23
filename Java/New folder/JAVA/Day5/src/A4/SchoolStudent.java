package A4;

public class SchoolStudent extends Student {

    private String className;

    public SchoolStudent(String className, int rollNo, double percentage) {
        super(rollNo, percentage);
        this.className = className;
    }

    @Override
    public String toString() {
        return "SchoolStudent className= " + className + super.toString();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
