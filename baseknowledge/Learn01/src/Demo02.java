import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo02 {

	public static void main(String[] args) throws ParseException {
		
		Date d1 = new Date(System.currentTimeMillis());
		
		Calendar c1 = Calendar.getInstance();
		
		System.out.println(c1.getTime());
		
		//��ʽ��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("��ʽ��ǰd1=" + d1.toString() );
		System.out.println("��ʽ����d1=" + sdf.format(d1));
		
		//String��Dateת��
		String date = "2015-06-01";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date d2 = sdf1.parse(date);
		System.out.println("Stringת��ΪDate, d2=" + d2.toString());
		
		
		//��Date����ת��ΪString����
		String s1 = sdf1.format(d2);
		System.out.println("Dateת��ΪString,s1 =" + s1);
		
	}
	
}
