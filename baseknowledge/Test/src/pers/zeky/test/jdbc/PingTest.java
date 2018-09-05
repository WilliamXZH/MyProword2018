package pers.zeky.test.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PingTest {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		try {
			String line = null;
			Process process = runtime.exec("ping www.google.com -w 1000");
			BufferedReader buf = new BufferedReader(new InputStreamReader(
                    process.getInputStream()));
            while ((line = buf.readLine()) != null){
            	if("«Î«Û≥¨ ±.".equals(line)){
            		return;
            	}
                System.out.println(line);
            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("IOException!!!");
		}
		
	}
	
}
