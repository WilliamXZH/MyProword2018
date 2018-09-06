package pers.zeky.chapter_4_leadin_stream.sec_4_stream_operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pers.zeky.chapter_4_leadin_stream.sec_2_stream_summary.Dish;
import pers.zeky.util.Menu;

public class Main {
	
	public static void main(String[] args) {
		
		List<Dish> menu = Menu.getMenu(); 
		System.out.println(menu);
		List<String> names = menu.stream()
				.filter(d->{
					System.out.println("filtering-"+d.getName());
					return d.getCalories()>400;
				}).map(d->{
					System.out.println("mapping-"+d.getName());
					return d.getName();
				}).limit(3)
				.collect(Collectors.toList());
		System.out.println(names);
		
		long count = menu.parallelStream()
				.filter(d->d.getCalories()>300)
				.distinct()//.limit(3)
				.count();
		System.out.println(count );
		
		
		
	}

}
