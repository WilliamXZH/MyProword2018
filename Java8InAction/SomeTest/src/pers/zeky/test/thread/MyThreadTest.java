package pers.zeky.test.thread;

public class MyThreadTest {
	
	public static void main(String[] args) {
		
		Common common = new Common();
		/*for(int i=0;i<100;i++){
			new MyThread(i,common).start();
		}*/
		
		for (int i=0;i<100;i++){
			Thread t = new Thread(){
				
				@Override
				public void run(){
					super.run();
					common.test2();
				}
				
			};
			t.start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		common.test3();
		
	}

}
