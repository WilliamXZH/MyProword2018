package pers.zeky.chapter_5_stream_using.sec_2_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import pers.zeky.util.ArrayUtil;

public class MappingTest {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		List<Integer> squares = numbers.stream()
				.map(n->n*n)
				.collect(Collectors.toList());
		
		List<Integer> numbers1 = Arrays.asList(1,2,3);
		List<Integer> numbers2 = Arrays.asList(3,4);
		List<int[]> pairs = numbers1.stream()
				.flatMap(i->numbers2.stream().map(j->new int[]{i,j}))
				.collect(Collectors.toList());
		pairs.forEach(ArrayUtil::printIntArray);
	}

}
