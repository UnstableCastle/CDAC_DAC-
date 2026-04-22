import java.io.FileInputStream;
import java.io.IOException;

public class Word_Count {

	public static void main(String[] args) throws IOException {

    	FileInputStream fis = null;
        try {
        	
        fis = new FileInputStream("abc.txt");

            int i =0;
           String s = "";
           int count = 0;
           
            while ((i = fis.read()) != -1) 
            {
                          
            	s = s+((char)i);
            	count++;
            }
            String arr[] = s.trim().split("\\s");
            int countWords = arr.length;
            System.out.println("Number of Characters : "+count);

            System.out.println("String : "+s);
            System.out.println("Word count : "+countWords);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
        	fis.close();
        }
        
    }
}
