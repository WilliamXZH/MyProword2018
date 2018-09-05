package pers.zeky.test.jdbc;

import java.io.ObjectInputStream;

public class Test01 {
	
	public static void main(String[] args) {
		
		//System.out.println(6/2(1+2));
		String string = "80%";
		
		String []arrays = string.split("%");
		
		for(int i=0;i<arrays.length;i++){
			System.out.println(i+":"+arrays[i]);
		
		}
		
	}

}
