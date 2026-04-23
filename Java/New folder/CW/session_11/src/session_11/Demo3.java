package session_11;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
public class Demo3 {
	
	public static void main(String[] args)
			throws IOException {
	 List<String> lines = 
			 Files.readAllLines(Path.of("abc.txt"));
		for(String line: lines)
		{
			System.out.println(line);
		}
		
	Path p =Files.write(Path.of("mno.txt"),
		Arrays.asList("List1","List2","List3","List4"));	
	System.out.println("Success");
		
	}

}
