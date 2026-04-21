import java.util.List;

public class Instructor {

	private String name;
	private int age;
	private String gender;
	private boolean isOnlineCourse;
	private int yearOfExp;
	private List<String> courses;
	
	public Instructor() {}

	public Instructor(String name, int age, String gender, boolean isOnlineCourse, int yearOfExp,
			List<String> courses) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isOnlineCourse = isOnlineCourse;
		this.yearOfExp = yearOfExp;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", age=" + age + ", gender=" + gender + ", isOnlineCourse=" + isOnlineCourse
				+ ", yearOfExp=" + yearOfExp + ", courses=" + courses + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isOnlineCourse() {
		return isOnlineCourse;
	}

	public void setOnlineCourse(boolean isOnlineCourse) {
		this.isOnlineCourse = isOnlineCourse;
	}

	public int getYearOfExp() {
		return yearOfExp;
	}

	public void setYearOfExp(int yearOfExp) {
		this.yearOfExp = yearOfExp;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}



}
