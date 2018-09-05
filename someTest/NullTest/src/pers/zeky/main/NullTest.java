package pers.zeky.main;

public class NullTest {

	private static void test(Object o){
		if(o==null){
			System.out.println("Object is null");
		}else{
			System.out.println("Object is not null");
		}
	}
	
	public static void main(String[] args) {
		
		test(null);
		test(new Object());
		
	}
	
}
