package control;

import javax.swing.JFrame;

public class DebugTest {

	public static void main(String[] args) {
		
		int [] ints = new int[20];
		for (int i = 0; i < ints.length; i++) {
			ints[i] = i+1;
			System.out.println(i+1);
		}
		
		try {
			for (int i = 0; i < 21; i++) {
				ints[i] = i+1;
				System.out.println(i+1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("数组越界");
		}
		
		System.out.println(123456);
		System.out.println(true);
		System.out.println("this is String debug info");
		System.out.println(new JFrame(){
			
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "This is a JFrame";
			}
		});
		System.err.println("This is a String error info");
	}
	
}
