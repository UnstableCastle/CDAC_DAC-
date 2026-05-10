import java.io.FileInputStream;
import java.io.IOException;

public class Vovels {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = null;
		try {

			fis = new FileInputStream("abc.txt");
			int i;
			int vovel = 0;
			int consonent = 0;
			int space = 0;

			while ((i = fis.read()) != -1) {
				if (i == 'A' || i == 'a' || i == 'E' || i == 'e' || i == 'I' || i == 'i' || i == 'O' || i == 'o'
						|| i == 'U' || i == 'u') {
					vovel++;
				} else if (i == 32) {
					space++;

				} else {
					consonent++;
				}

			}

			System.out.println("Number of Vovels : " + vovel);
			System.out.println("Number of Consonents : " + consonent);
			System.out.println("Number of Space : " + space);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			fis.close();
		}

	}
}
