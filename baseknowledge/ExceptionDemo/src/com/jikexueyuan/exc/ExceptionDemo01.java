package com.jikexueyuan.exc;

class Exc{
	//int i = 10;
	int a = 10;
	int b =10;
	
}

public class ExceptionDemo01 {

	public static void main(String[] args) {
		
		int tmp = 0;
		Exc e = null;
		e = new Exc();
		try {
			tmp = e.a/e.b;
			System.out.println(tmp);
		} catch (NullPointerException e2) {
			System.out.println("空指针异常:" + e2);
		}catch(ArithmeticException e3){
			System.out.println("算数异常:" + e3);
		}finally{
			System.out.println("程序退出");
		}
		
		
//		int a = 10;
//		int b = 0;
//
//		tmp = a/b;
//		System.out.println(tmp);
//		System.out.println("程序退出");
		
		/*		try {
			tmp = a/b;
		} catch (ArithmeticException e1) {
			System.out.println(e1);
		}
		System.out.println(tmp);*/
		
	}
	
}
