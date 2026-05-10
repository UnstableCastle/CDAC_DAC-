package session_14;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Test2 {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		DateTimeFormatter dtf = DateTimeFormatter.
				ofPattern("yyyy-MM-dd HH:mm:ss");
		String str = dt.format(dtf);
		System.out.println(str);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDate d1 =  LocalDate.of(1999, 4, 22);
		Period period = Period.between(date, d1);
		System.out.println(period);
		
		time = time.plusHours(2);//immutable
		System.out.println(time);
		
		LocalTime t1 = time.plusHours(3);
			Duration d=	Duration.between(time, t1);
			System.out.println(d);
	}

}
