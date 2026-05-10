import java.io.File;
import java.io.IOException;

public class FILEdemo {

	File file;

	public FILEdemo() throws IOException {
	
	file = new File("data.txt");
	if (file.exists()) {
		
		System.out.println("File Exists at"+file.getAbsolutePath()+" ---- "+file.getCanonicalPath()+" ---- "+file.getPath());	
	}else {
		System.out.println(file.createNewFile());
	}
	if(file.canRead()) {
		System.out.println("Can read");
	}
	
	if(file.canWrite()) {
		System.out.println("Can Write");
	}
	
	System.out.println(file.getParent());

//	System.out.println(file.delete());
	
	}
	
	
	
	

	public static void main(String[] args) throws IOException {
		FILEdemo f= new FILEdemo(); 
		
	}
}
