import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method; 

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException{
		Class myClass = Class.forName("Employee");
		System.out.println("class = " + myClass);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		Class supercls = myClass.getSuperclass();
		System.out.println("Parent ="+supercls);
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		
		Method method[] = myClass.getMethods();
		System.out.println("Methods are : ");
		for(Method m : method ) {
			System.out.println(m);
			
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

		
		Constructor constructor[] = myClass.getConstructors();
		System.out.println("constructor are : ");
		for(Constructor c : constructor ) {
			System.out.println(c);
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

		
		Field field[] = myClass.getFields();
		for(Field f : field ) {
			System.out.println(f);
		
		}
		
		
	}
	
}
 