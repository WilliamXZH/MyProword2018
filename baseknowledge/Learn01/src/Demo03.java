import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Project Name: Learn01
 * Class Name: Demo03
 * Class Description:
 * @author william zeky
 * Create Time: 2018年1月8日 下午1:53:03
 * 
 * Modified By: william zeky
 * Modified Time: %{date} 下午1:53:03
 * Modified Remarks:
 *
 * @version
 * @Copyright 
 */
public class Demo03 {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		//设定生日，String
		String birthday = "2015-05-30";
		
		//将String类型转换为日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(birthday);
		
		//对日期进行计算
		Date spec = prepareBirthdayDay(date);
		
		//将计算后的结果，转换为S听类型，输出
		String s2 = sdf.format(spec);
		System.out.println(birthday + "提前2周的周六为:" + s2 );
	}
	
	/**
	 * 传入1个日期，计算出改日期的2个星期前的周六的日期
	 * @param birthdayDate
	 * @return
	 */
	public static Date prepareBirthdayDay(Date birthdayDate){
		
		Calendar cal = new GregorianCalendar();//接受传入的date日期，转换为Calendar
		cal.setTime(birthdayDate);//提前2周
		cal.add(Calendar.WEEK_OF_MONTH, -12);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);//调整为当前星期的周六
		return cal.getTime();
		
	}
	
}
