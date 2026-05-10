package session_11;
import java.io.File;
import java.io.IOException;
public class Demo1 {
	File file;
	String path;
	public Demo1() throws IOException
	{
		file = new File("data.txt");
		if(file.exists())
		{
			System.out.println("File already present "
		+file.getCanonicalPath()
			/*file.getPath()*//*file.getAbsolutePath()*/);
		}
		else
		{
			System.out.println(file.createNewFile());
		}
		
		if(file.canRead())
		{
			System.out.println("Read Mode");
		}
		
		if(file.canWrite())
		{
			System.out.println("Write mode");
		}
		
		//file.delete();
		//file.getName();
		//file.getParent();
	}
	
	public static void main(String[] args) throws IOException {
		Demo1 d = new Demo1();
	}
}
