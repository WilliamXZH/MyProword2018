package pers.zeky.chapter_1.sec3_stream;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import pers.zeky.chapter_1.sec2_function.Apple;

public class AppleTest {
	
	public static void main(String[] args) {
		
		List<Apple> inventory = Arrays.asList(new Apple(10,"green"),
				new Apple(200,"red"),
				new Apple(150,"white"),
				new Apple(175,"brown"));
		
		Date flag1 = new Date();
		List<Apple> heavyApples = inventory.stream()
				.filter((Apple a)->a.getWeight()>150)
				.collect(Collectors.toList());
		System.out.println(new Date().getTime()-flag1.getTime());
		heavyApples.forEach(Apple::outputAppleInfo);
		System.out.println();
		Date flag2 = new Date();
		List<Apple> heavyApples2 = inventory.parallelStream()
				.filter((Apple a)->a.getWeight()>150)
				.collect(Collectors.toList());
		System.out.println(new Date().getTime()-flag2.getTime());
		heavyApples2.forEach(Apple::outputAppleInfo);
	}

}
