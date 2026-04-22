package A4;

public class CollegeStudent extends Student {
	
	private int semister;
	
	

	public CollegeStudent(int rollNo,double percentage,int semister) {
		super(rollNo,percentage);
		this.semister=semister;
	}
	
	

	public int getSemister() {
		return semister;
	}

	public void setSemister(int semister) {
		this.semister = semister;
	}

	@Override
	public String toString() {
		return "College Student :  Semister =  "+semister+super.toString();
	}
}
