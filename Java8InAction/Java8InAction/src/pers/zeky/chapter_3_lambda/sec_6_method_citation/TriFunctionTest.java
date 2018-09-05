package pers.zeky.chapter_3_lambda.sec_6_method_citation;

public class TriFunctionTest {

	public static void main(String[] args) {
		
		TriFunction<Integer,Integer,Integer,Color> colorFactory = Color::new;
		
	}
	
}
