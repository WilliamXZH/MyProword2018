package pers.zeky.chapter_5_stream_using.sec_4_reduce;

import java.util.List;
import java.util.Optional;

import pers.zeky.util.IntListUtil;

public class Main {
	
	public static void main(String[] args) {
		List<Integer> numbers = IntListUtil.getDefault2IntList();
		numbers.forEach(a->System.out.print(a+"\t"));
		System.out.println();
		int sum = 0;
		for (int x:numbers){
			sum += x;
		}
		System.out.println(sum);
		int sum2 = numbers.stream().reduce(0, (a,b)->a+b);
		System.out.println(sum2);
		long product=  numbers.parallelStream().reduce(1, (a,b)->a*b);
		System.out.println(product);
		
		int sum3 = numbers.stream().reduce(0, Integer::sum);
		Optional<Integer> sum4 = numbers.stream().reduce((a,b)->(a+b));
		System.out.println(sum3);
		System.out.println(sum4.get());
		Optional<Integer> sum5 = numbers.parallelStream().reduce((a,b)->a*b);
		System.out.println(sum5.get());
		
		Optional<Integer> max = numbers.parallelStream().reduce(Integer::max);
		Optional<Integer> min = numbers.parallelStream().reduce(Integer::min);
		System.out.println(max+":"+min);
		
	}

}
