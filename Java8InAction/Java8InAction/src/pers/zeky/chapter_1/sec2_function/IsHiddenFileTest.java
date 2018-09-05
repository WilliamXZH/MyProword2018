package pers.zeky.chapter_1.sec2_function;

import java.io.File;
import java.io.FileFilter;

public class IsHiddenFileTest {

	public static void main(String[] args) {
		
		File[] hiddenFiles = new File(".").listFiles(new FileFilter(){

			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.isHidden();
			}
			
		});
		
		System.out.println(hiddenFiles.length);
		
		File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);
		System.out.println(hiddenFiles2.length);
		
	}
	
}
