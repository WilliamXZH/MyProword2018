package com.jikexueyuan.exc;

public class ExceptionDemo03 {

	public static void main(String[] args) {
		try{
			throw new Exception("实例化异常对象");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
}
