import java.util.Calendar;
import java.util.Date;

public class Demo01 {

	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		System.out.println("now = " + now);
		
		Date d1 = new Date(now);
		System.out.println("d1 = " + d1);
		
		Calendar c1 = Calendar.getInstance();
		System.out.println("c1 = " + c1.getTime().toString());
		System.out.println(c1.getTimeZone());
	}
	
}
