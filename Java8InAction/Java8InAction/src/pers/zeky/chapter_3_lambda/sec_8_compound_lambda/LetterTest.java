package pers.zeky.chapter_3_lambda.sec_8_compound_lambda;

import java.util.function.Function;

public class LetterTest {

	public static void main(String[] args) {
		Function<String,String> addHeader = Letter::addHeader;
		Function<String,String> transformationPipeline
			= addHeader.andThen(Letter::checkSpelling).andThen(Letter::addFooter);
	}
	
}
