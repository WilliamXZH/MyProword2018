package pers.zeky.chapter_5_stream_using.sec_2_map;

import java.lang.reflect.Array;

public class ArrayUtil {

	public static <T> void printArray(T[] ts){
		for(int i=0;i<ts.length;i++){
			System.out.print(ts[i]+"\t");
		}
		System.out.println();
	}
	
	public static void printIntArray(int[] ts){
		printArray(intBoxing(ts));
	}
	public static Integer[] intBoxing(int[] intArray){
		return (Integer[]) Array.newInstance(Integer[].class, intArray);
	}
	
	public static Integer intBoxing(int i){
		return new Integer(i);
	}

}
