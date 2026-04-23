import java.io.*;

public class Demo6 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("abc.txt");
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("\n Resource freed");
			fis.close();
		}
		
	}

}
