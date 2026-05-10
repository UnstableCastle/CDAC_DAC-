package A4;

public class Student {
    protected int rollNo;
    protected double percentage;

   
    public Student(int rollNo, double percentage) {
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

   
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

   
    @Override
    public String toString() {
        return "Rollno = " + rollNo + ", Percentage = " + percentage;
    }
}
