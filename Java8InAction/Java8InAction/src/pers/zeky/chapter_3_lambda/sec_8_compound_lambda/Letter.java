package pers.zeky.chapter_3_lambda.sec_8_compound_lambda;

public class Letter {

	public static String addHeader(String text){
		return "From Raoul, Mario and Alan: " + text;
	}
	public static String addFooter(String text){
		return text+"Kind regards";
	}
	public static String checkSpelling(String text){
		return text.replace("labda", "lambda");
	}
	
}
