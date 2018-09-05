package pers.zeky.main;

import java.sql.Timestamp;
import java.util.Date;

import org.junit.Test;

public class TimestampToStrTest {

	@Test
	public void test(){
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);
		
		System.out.println(new Date(timestamp.getTime()));
		System.out.println(new Timestamp(new Date().getTime()));
		
	}
	
}
