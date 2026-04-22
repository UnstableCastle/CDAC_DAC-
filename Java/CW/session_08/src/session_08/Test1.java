package session_08;

import java.io.*;
//De-Serialization
public class Test1 {
	
	public static void main(String[] args) 
	throws FileNotFoundException, IOException,
	ClassNotFoundException 
	{	
		ObjectInputStream ois = 
	new ObjectInputStream(new FileInputStream("data.txt"));
		Student s = (Student) ois.readObject();
		System.out.println(s);
		ois.close();
	}
}
