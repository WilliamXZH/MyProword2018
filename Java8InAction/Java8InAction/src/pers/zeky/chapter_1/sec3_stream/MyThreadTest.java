package pers.zeky.chapter_1.sec3_stream;


public class MyThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		Integer num = 10;
		System.out.println(new MyThread(num).myStart(3));
		
		try {
			Thread.sleep(1000);
			System.out.println(num);
			System.out.println(new MyThread().myStart(5));
			Thread.sleep(1000);
			System.out.println(MyThread.getOnum());
			System.out.println(num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		MyThread.setOnum(num);
		new MyThread().myStart(2);
		new MyThread().myStart(1);
		Thread.sleep(1000);
		System.out.println(MyThread.getOnum());
		
		
	}
	

}
