package pers.zeky.main;

public class EnumEqualsTest {
	
	public static void main(String[] args) {
		
		Status a = Status.FINISHED;
		Status b = Status.RUNNING;
		Status c = Status.FINISHED;
		
		System.out.println(a.equals(c));
		System.out.println(a.toString().equals(c));
		System.out.println(a.toString().equals(c.toString()));
		System.out.println(a.toString());
		System.out.println(a);
		
		
	}

}
