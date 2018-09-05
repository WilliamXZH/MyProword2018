package pers.zeky.main;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class SqlDateToStrTest {

	@Test
	public void test(){
		
		Date date = new Date(1520389277290L);
		
		System.out.println(Date.valueOf("2018-03-01"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str;
		
		
	}
	
}
