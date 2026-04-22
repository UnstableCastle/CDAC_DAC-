package session_08;
import java.io.*;
public class Test {
	public static void main(String[] args)
			throws IOException{
		
		FileOutputStream fos = 
				new FileOutputStream("data.txt");
		ObjectOutputStream oos = 
				new ObjectOutputStream(fos);
		Student student = new Student(1, "Rahul");
		oos.writeObject(student);
		System.out.println("Success");
		oos.close();
		fos.close();	
	}
}



