import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5_FileIO {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("abc.txt", true)) {

			String str = "hello";
			byte[] b = str.getBytes();
			fos.write(b);
			System.out.println("Data successfully written!");

		} catch (IOException e) {

			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}