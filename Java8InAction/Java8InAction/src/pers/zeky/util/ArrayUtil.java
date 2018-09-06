package pers.zeky.util;


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
		Integer[] ints = new Integer[intArray.length];
		for (int i=0;i<intArray.length;i++){
			ints[i] = intArray[i];
		}
		return ints;
	}
	
	public static Integer intBoxing(int i){
		return new Integer(i);
	}

}
