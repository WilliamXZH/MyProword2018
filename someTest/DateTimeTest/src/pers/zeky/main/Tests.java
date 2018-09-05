package pers.zeky.main;

import java.util.Date;

import org.junit.Test;

public class Tests {
	
	@Test
	public void test(){
		System.out.println("test!!!");
		System.out.println(new Date());
		
	}
	
	public static void main(String[] args) {

		Boolean a = null;
		
		try{
			System.out.println(false==a);
		}catch (Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println(false);
	}
}
