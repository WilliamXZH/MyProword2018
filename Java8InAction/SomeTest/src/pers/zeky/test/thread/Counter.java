package pers.zeky.test.thread;

public class Counter {
	
	private static Integer c = 0;
	
	public static  IntegerWrapper getCounter(){
		return new IntegerWrapper(c++);
	}

}
