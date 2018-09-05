package pers.zeky.chapter_2.sec_3_anonymous_class;

public class MeaningOfThis {
	
	public final int value = 4;
	public void doIt(){
		int value = 6;
		Runnable r= new Runnable(){
			public final int value = 5;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				int value = 10;
				System.out.println(this.value);
			}
			
		};
		r.run();
	}
	
	public static void main(String[] args) {
		new MeaningOfThis().doIt();
	}

}
