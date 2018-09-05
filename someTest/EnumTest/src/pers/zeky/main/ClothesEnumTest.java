package pers.zeky.main;

public class ClothesEnumTest {

	public static void main(String[] args) {
		Clothes s = Clothes.SMALL;
		Clothes m = Clothes.MIDDLE;
		Clothes l = Clothes.LARGE;
		
		System.out.println(s);
		
		Object o = test();
		System.out.println(o);
		System.out.println(false==((Boolean)o));
		
	}
	
	static boolean test(){
		return false;
	}
	
}
