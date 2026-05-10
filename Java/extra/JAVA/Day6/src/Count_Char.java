import java.io.FileInputStream;
import java.io.IOException;

public class Count_Char {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("abc.txt")) {

            int i;
            int count = 0;

            while ((i = fis.read()) != -1) {
                if (i == 'A' || i == 'a') {
                    count++;
                }
            }

            System.out.println("Count: " + count);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
