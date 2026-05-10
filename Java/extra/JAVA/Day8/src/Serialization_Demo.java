import java.io.*;

public class Serialization_Demo {
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("data.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Student s = new Student(1, "CASTLE");
		oos.writeObject(s);
		System.out.println("Sucess!!!");
		oos.close();
		fos.close();

	}

}
