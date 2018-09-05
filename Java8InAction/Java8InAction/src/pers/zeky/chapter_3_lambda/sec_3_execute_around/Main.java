package pers.zeky.chapter_3_lambda.sec_3_execute_around;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	@FunctionalInterface
	public interface BufferedReaderProcessor{
		String process(BufferedReader b) throws IOException;
	}
	
	public static String processFile(BufferedReaderProcessor p) throws IOException{
		try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
			return p.process(br);
		}
	}
	
	public static String processFile() throws IOException{
		try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
			return br.readLine();
		}
	}
	
	public static void main(String[] args) throws IOException {
		//String result = processFile((BufferedReader br)->br.readLine()+br.readLine());
		
		String oneLine = processFile((BufferedReader br)->br.readLine());
		
		String twoLines = processFile((BufferedReader br)->br.readLine()+br.readLine());
		
		System.out.println(oneLine);
		
	}
	
}
