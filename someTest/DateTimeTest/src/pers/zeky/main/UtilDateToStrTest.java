package pers.zeky.main;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class UtilDateToStrTest {

	@Test
	public void test01() {
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toGMTString());
		System.out.println(date.toString());
		System.out.println(date.toInstant());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		System.out.println(date.getTime());
		System.out.println(new Date(date.getTime()));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat();
		System.out.println(sdf2.format(date));
		
	}

	
}
