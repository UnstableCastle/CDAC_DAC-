import java.io.*;

public class Deserialization_Demo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));

		Student s = (Student) ois.readObject();
		System.out.println(s);
		ois.close();

	}
}