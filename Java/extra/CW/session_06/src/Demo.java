import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Demo {
	public static void main(String[] args)
			throws ParseException {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("MM/dd/yyyy");
	String s = sdf.format(d);//formatting - date to String
		System.out.println(s);
		
		Date d1 = sdf.parse(s);//Parsing - String to date
		System.out.println(d1);
	}
}
