package pers.zeky.chapter_3_lambda.sec_2_where_and_how_use_lambda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	static Runnable r1 = () -> System.out.println("Hello World 1.");
	static Runnable r2 = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Hello World 2!");
		}

	};

	public static void process(Runnable r) {
		r.run();
	}
	
	public static void outputFilePath() throws IOException{
//		# java.version                                Java Runtime Environment version  
//		# java.vendor                                Java Runtime Environment vendor  
//		# java.vendor.url                           Java vendor URL  
//		# java.home                                Java installation directory  
//		# java.vm.specification.version   Java Virtual Machine specification version  
//		# java.vm.specification.vendor    Java Virtual Machine specification vendor  
//		# java.vm.specification.name      Java Virtual Machine specification name  
//		# java.vm.version                        Java Virtual Machine implementation version  
//		# java.vm.vendor                        Java Virtual Machine implementation vendor  
//		# java.vm.name                        Java Virtual Machine implementation name  
//		# java.specification.version        Java Runtime Environment specification version  
//		# java.specification.vendor         Java Runtime Environment specification vendor  
//		# java.specification.name           Java Runtime Environment specification name  
//		# java.class.version                    Java class format version number  
//		# java.class.path                      Java class path  
//		# java.library.path                 List of paths to search when loading libraries  
//		# java.io.tmpdir                       Default temp file path  
//		# java.compiler                       Name of JIT compiler to use  
//		# java.ext.dirs                       Path of extension directory or directories  
//		# os.name                              Operating system name  
//		# os.arch                                  Operating system architecture  
//		# os.version                       Operating system version  
//		# file.separator                         File separator ("/" on UNIX)  
//		# path.separator                  Path separator (":" on UNIX)  
//		# line.separator                       Line separator ("/n" on UNIX)  
//		# user.name                        User’s account name  
//		# user.home                              User’s home directory  
//		# user.dir                               User’s current working directory
		System.out.println(System.getProperty("user.dir"));
		File directory = new File("123");
		/**
		 * # 对于getCanonicalPath()函数，“."就表示当前的文件夹，而”..“则表示当前文件夹的上一级文件夹 
		 * # 对于getAbsolutePath()函数，则不管”.”、“..”，返回当前的路径加上你在new File()时设定的路径 
 		 * # 至于getPath()函数，得到的只是你在new File()时设定的路径 
		 */
		System.out.println(directory.getCanonicalPath());
		System.out.println(directory.getAbsolutePath());
		System.out.println(directory.getPath());
	}

	public static void main(String[] args) throws IOException {

		process(r1);
		process(r2);
		process(()->System.out.println("Hello World 3?"));
		//outputFilePath();
		
		String result = processFile((BufferedReader br)->br.readLine()+br.readLine());
		System.out.println(result);
		
	}
	
	public static String processFile(){
		try {
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			return br.readLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static String processFile(BufferedReaderProcessor p){
		try {
			return p.process(new BufferedReader(new FileReader("data.txt")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
