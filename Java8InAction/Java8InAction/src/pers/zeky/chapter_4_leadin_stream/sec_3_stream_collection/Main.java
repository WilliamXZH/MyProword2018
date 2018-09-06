package pers.zeky.chapter_4_leadin_stream.sec_3_stream_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import pers.zeky.chapter_4_leadin_stream.sec_2_stream_summary.Dish;
import pers.zeky.util.Menu;

public class Main {

	public static void main(String[] args) {
		
		List<String> title = Arrays.asList("Java8","In","Action");
		Stream<String> s = title.stream();
		s.forEach(System.out::println);
		//s.forEach(System.out::println);//stream can be used only once.
		
		List<Dish> menu = Menu.getMenu();
		/* for-each循环外部迭代 */
		List<String> names = new ArrayList<>();
		
		for (Dish d:menu){
			names.add(d.getName());
		}
		System.out.println(names);
		
		List<String> names2 = new ArrayList<>();
		Iterator<Dish> iterator = menu.iterator();
		while(iterator.hasNext()){
			names2.add(iterator.next().getName());
		}
		System.out.println(names2);
		
		List<String> names3 = menu.stream().map(Dish::getName).collect(Collectors.toList());	
		System.out.println(names3);
	}
	
}
