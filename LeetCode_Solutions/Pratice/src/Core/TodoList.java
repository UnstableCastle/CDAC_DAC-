package Core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

	public static void main(String[] args) {
		
		List<String> task = new ArrayList();
		task.add("Wake Up");
		task.add("Drink Coffee");
		task.add("Code");
		
		task.add(1, "brush teeth");
		
		task.set(2, "drink water");
		
		task.remove(0);
		
		System.out.println(task.contains("Code"));
		
		System.out.println(task.size());
		
		System.out.println("final task : "+ task);
		
		for (String string : task) {
			System.out.println(string);
		}
		
		
		
		}
	}
