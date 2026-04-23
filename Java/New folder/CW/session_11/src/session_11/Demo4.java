package session_11;
import java.io.*;
public class Demo4 {
	
	public static void main(String[] args) 
		throws FileNotFoundException, IOException {
		String str= null;
		try(BufferedReader br = 
		new BufferedReader(new FileReader("abc.txt"));
				BufferedWriter bw = 
		new BufferedWriter(new FileWriter("mno.txt")))
		{
			while((str = br.readLine())!=null)
			{
				System.out.println(str);
			}
			//bw.write(str);
			//bw.newLine();
		}
	}
}
