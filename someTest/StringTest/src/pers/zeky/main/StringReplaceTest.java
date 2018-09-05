package pers.zeky.main;

import java.util.Date;

public class StringReplaceTest {

	public static void main(String[] args) {
		
		String str = "ASD^^^adasas^^^123";
		System.out.println(str.replace("^^^", ""));
		System.out.println("???!!!");
		//System.out.println(new Date(null));
		
		String s = null ;
		
		System.out.println(String.valueOf(s));
		
		String ss = "^^^^^^^^^adsa^^^";
		System.out.println(ss.split("\\^\\^\\^").length);
		
	}
	
}
