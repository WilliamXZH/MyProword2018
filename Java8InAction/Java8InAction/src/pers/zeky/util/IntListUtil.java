package pers.zeky.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.junit.Test;

public class IntListUtil {

	public static List<Integer> getIntList(Integer c,Integer b){
		
		List<Integer> list = new ArrayList<>();
		Random r = new Random();
		for (int i=0;i<c;i++){
			list.add(r.nextInt()%b);
		}
		return list;
	}

	public static List<Integer> getDefaultIntList(){
		return IntListUtil.getPositiveIntList(10, 100);
	}
	public static List<Integer> getDefault2IntList(){
		return IntListUtil.getPositiveIntList(5, 30);
	}
	
	public static List<Integer> getPositiveIntList(Integer c,Integer b){
		return (List<Integer>) IntListUtil.getIntList(c, b).parallelStream().map(i->{
			return i<0?-i:i;
		}).collect(Collectors.toList());
	}
	
	public static List<Integer> getNegativeIntList(Integer c,Integer b){
		return (List<Integer>) IntListUtil.getIntList(c, b).parallelStream().map(i->{
			return i<0?i:-i;
		}).collect(Collectors.toList());
	}
	
	@Test
	public void test(){
		int i = 0;
		IntListUtil.getIntList(10,100).forEach(a->{
			System.out.print(a+"\t");
		});
		System.out.println();
		IntListUtil.getDefaultIntList().forEach(a->{
			System.out.print(a+"\t");
		});
	}
	
}
