package pers.zeky.chapter_3_lambda.sec_4_functional_interface;

import java.io.BufferedReader;
import java.io.IOException;

public class ExceptionTest {
	
	@FunctionalInterface
	public interface BufferedReaderProcessor{
		String process(BufferedReader b)throws IOException;
	}

	public static void main(String[] args) {
		BufferedReaderProcessor p = (BufferedReader br)->br.readLine();
		
		Function<BufferedReader,String> f = (BufferedReader b)->{
			try{
				return b.readLine();
			}catch(IOException e){
				throw new RuntimeException(e);
			}
		};
	}
	
}
