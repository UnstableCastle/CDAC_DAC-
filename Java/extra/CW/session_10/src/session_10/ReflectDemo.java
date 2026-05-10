package session_10;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class ReflectDemo {
	public static void main(String[] args)
			throws ClassNotFoundException {
		
	 Class myCls = Class.forName("session_10.Employee");
		System.out.println("Class = "+myCls);
		
	Class superCls = myCls.getSuperclass();
	System.out.println("Parent = "+superCls);
	
	Method method[] = myCls.getMethods();
	System.out.println("Methods are: ");
	for(Method m:method)
	{
		System.out.println(m);
	}
	
	Constructor construct[] =  myCls.getConstructors();
	System.out.println("\nConstructors are: ");
	for(Constructor c:construct)
	{
		System.out.println(c);
	}
	
	Field field[] = myCls.getFields();
	System.out.println("\nFields are: ");
	for(Field f:field)
	{
		System.out.println(f);
	}
	}

}
