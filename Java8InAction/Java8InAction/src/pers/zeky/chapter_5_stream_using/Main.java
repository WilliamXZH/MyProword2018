package pers.zeky.chapter_5_stream_using;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pers.zeky.chapter_4_leadin_stream.sec_2_stream_summary.Dish;
import pers.zeky.util.Menu;

public class Main {

	public static void main(String[] args) {
		List<Dish> menu = Menu.getMenu();
		List<Dish> vegetarianDishes = new ArrayList<>();
		for (Dish d:menu){
			if (d.isVegetarian()){
				vegetarianDishes.add(d);
			}
		}
		System.out.println(vegetarianDishes);
		
		List<Dish> vegetarianDishes2 = menu.parallelStream()
				.filter(Dish::isVegetarian)
				.collect(Collectors.toList());
		System.out.println(vegetarianDishes2);
	}
	
}
