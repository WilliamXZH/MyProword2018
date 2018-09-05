package pers.zeky.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.junit.Test;

public class StringBuilderToStringTest {

	public static String convertStreamToString(InputStream is){
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();
		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line + "/n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
	
	
	public static void test() {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		System.out.println(StringBuilderToStringTest.convertStreamToString(System.in));
		
//		InputStream is = new InputStream(str);
		
	}
	
	
	@Test
	public void test02(){
		
		StringBuilder sb = new StringBuilder();
		sb.append("123");
		sb.append("abc");
		sb.append(",./");
		System.out.println(sb);
		System.out.println(sb.toString());
		
	}
	
}
