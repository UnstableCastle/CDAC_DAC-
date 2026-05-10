package session_11;
import java.io.*;
public class Demo2 {
	public static void main(String[] args) 
			throws IOException {
		/*try()
		{
			
		}catch (Exception e) {
			// TODO: handle exception
		}*/
		
		RandomAccessFile raf1 = null;
		RandomAccessFile raf2 = null;
		try
		{
		File f1 = new File("abc.txt");
		File f2 = new File("mno.txt");
		
		raf1 = new RandomAccessFile(f1, "r");
		raf2 = new RandomAccessFile(f2, "rw");
	
		System.out.println(raf1.getFilePointer());
		raf1.seek(10);
		System.out.println(raf1.getFilePointer());
		int x = 0;
		do
		{
			x = raf1.read();
			System.out.println(x);
			raf2.write(x);
		}while(x!=-1);
		System.out.println("Success");
		}catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			raf1.close();
			raf2.close();
		}	
	}
}
