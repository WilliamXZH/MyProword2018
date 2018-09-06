package pers.zeky.chapter_5_stream_using.sec_2_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import pers.zeky.chapter_4_leadin_stream.sec_2_stream_summary.Dish;
import pers.zeky.util.Menu;

public class Main {

	public static void main(String[] args) {
			
		List<Dish> menu = Menu.getMenu();
		/* 对流中每一个元素应用函数 */
		List<String> dishName = menu.stream()
				.map(Dish::getName)
				.collect(Collectors.toList());
		
		List<String> words = Arrays.asList("Java 8","Lambdas","In","Action");
		List<Integer> wordLengths = words.stream()
				.map(String::length)
				.collect(Collectors.toList());
		
		List<Integer> dishNameLengths = menu.stream()
				.map(Dish::getName)
				.map(String::length)
				.collect(Collectors.toList());
		System.out.println(dishNameLengths);
		
	}
	
}
