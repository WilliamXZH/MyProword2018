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
 * Create Time: 2018��1��8�� ����1:53:03
 * 
 * Modified By: william zeky
 * Modified Time: %{date} ����1:53:03
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
		//�趨���գ�String
		String birthday = "2015-05-30";
		
		//��String����ת��Ϊ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(birthday);
		
		//�����ڽ��м���
		Date spec = prepareBirthdayDay(date);
		
		//�������Ľ����ת��ΪS�����ͣ����
		String s2 = sdf.format(spec);
		System.out.println(birthday + "��ǰ2�ܵ�����Ϊ:" + s2 );
	}
	
	/**
	 * ����1�����ڣ�����������ڵ�2������ǰ������������
	 * @param birthdayDate
	 * @return
	 */
	public static Date prepareBirthdayDay(Date birthdayDate){
		
		Calendar cal = new GregorianCalendar();//���ܴ����date���ڣ�ת��ΪCalendar
		cal.setTime(birthdayDate);//��ǰ2��
		cal.add(Calendar.WEEK_OF_MONTH, -12);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);//����Ϊ��ǰ���ڵ�����
		return cal.getTime();
		
	}
	
}
