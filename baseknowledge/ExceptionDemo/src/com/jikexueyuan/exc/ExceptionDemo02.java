package com.jikexueyuan.exc;

public class ExceptionDemo02 {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * 1.try...catch
		 * 2.throws...exception
		 */
		try {
			tell(10,0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void tell(int i, int j) throws ArithmeticException{
		int temp = 0;
		temp = i/j;
		System.out.println(temp);
	}
	
}
