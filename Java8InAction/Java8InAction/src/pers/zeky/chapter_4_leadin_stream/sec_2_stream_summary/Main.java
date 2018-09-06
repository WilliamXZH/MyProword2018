package pers.zeky.chapter_4_leadin_stream.sec_2_stream_summary;

import java.util.List;
import java.util.stream.Collectors;

import pers.zeky.util.Menu;

public class Main {

	public static void main(String[] args) {
		
		List<Dish> menu = Menu.getMenu();
		List<String> threeHighCaloricDishNames = menu.stream()
				.filter(d->d.getCalories()>300)
				.map(Dish::getName)
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(threeHighCaloricDishNames);
		
	}
	
}
