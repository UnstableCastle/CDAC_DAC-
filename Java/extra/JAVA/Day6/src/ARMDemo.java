import java.io.*;

public class ARMDemo {

    public static void main(String[] args) {
        
       
        try (FileInputStream fis = new FileInputStream("abc.txt");
             FileOutputStream fos = new FileOutputStream("mno.text")) {

        	String str = "hello";
			byte[] b = str.getBytes();
			fos.write(b);
			System.out.println("Data successfully written!");
           
        } catch (FileNotFoundException e) {
            
            System.err.println("Error: The source file could not be found. " + e.getMessage());
        } catch (IOException e) {
            
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }
}