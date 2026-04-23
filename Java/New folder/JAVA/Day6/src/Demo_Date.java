import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Demo_Date {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

		String s = sdf.format(d);
		System.out.println(s);

		Date d1 = sdf.parse(s);
		System.out.println(d1);

	}

}
