package A3;
public class FullTimefaculty extends Faculty {

    private int basic;
    private int allowance;

    public FullTimefaculty(int facultyid, int basic, int allowance) {
        super(facultyid);
        this.basic = basic;
        this.allowance = allowance;
        this.sal = basic + allowance;
    }

    @Override
    public String toString() {
        return "FullTimefaculty [basic=" + basic + ", allowance=" + allowance + ", salary=" + sal + "]";
    }

    public int getBasic() {
        return basic;
    }

    public int getAllowance() {
        return allowance;
    }
}