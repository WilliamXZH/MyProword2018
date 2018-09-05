package pers.zeky.chapter_3_lambda.sec_2_where_and_how_use_lambda;

import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcessor {

	String process(BufferedReader b) throws IOException;
	
}
