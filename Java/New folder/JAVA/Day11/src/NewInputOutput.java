import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.*;

public class NewInputOutput {

	public static void main(String[] args) throws IOException {
		List<String> list = Files.readAllLines(Path.of("abc.txt"));

		for (String list1 : list) {
			System.out.println(list1);
		}

		

//		Path p =
		Files.write(Path.of("mno.txt"), Arrays.asList("list1", "list2", "list3"));

		System.out.println("Success");

	}

}
