package pers.zeky.test;

import java.util.Date;

public class DateTest {
	

	public static void main(String[] args) {
		String dateStr = "2018-09-03 14:36:37";
		//Date date = new Date(dateStr);
		//System.out.println(date);
		System.out.println(new Date().toString());
		System.out.println(DateUtil.convertToDate(dateStr));
		
		String tDateStr = "2018-09-03T14:36:37";
		System.out.println(DateUtil.convertToDate(tDateStr));
		
	}

}
