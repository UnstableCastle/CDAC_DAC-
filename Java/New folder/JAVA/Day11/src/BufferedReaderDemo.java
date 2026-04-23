import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		String str = null;
		try (
				BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("mno.txt"));

		) {

			while ((str = br.readLine()) != null) {
				System.out.println(str);

				bw.write(str);
				bw.newLine();

			}
			
			
			
			System.out.println("\n Success!!");

		} catch (Exception e) {

		}
	}

}
