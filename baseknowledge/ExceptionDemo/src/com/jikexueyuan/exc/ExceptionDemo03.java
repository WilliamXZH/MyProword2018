package com.jikexueyuan.exc;

public class ExceptionDemo03 {

	public static void main(String[] args) {
		try{
			throw new Exception("ʵ�����쳣����");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
}
