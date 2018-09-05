package pers.zeky.chapter_4_leadin_stream.sec_1_whats_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		
		List<Dish> menu = Arrays.asList(new Dish(150,"vegetables",Type.GREENS),
				new Dish(500,"bouilli",Type.MEAT),new Dish(200,"Steamed Fish",Type.FISH),
				new Dish(750,"fruit-pear",Type.OTHER),new Dish(450,"apple",Type.OTHER));
		
		List<Dish> lowCaloricDishes = new ArrayList<>();
		
		for (Dish d:menu){
			if (d.getCalories() < 400){
				lowCaloricDishes.add(d);
			}
		}
		Collections.sort(lowCaloricDishes, new Comparator<Dish>(){

			@Override
			public int compare(Dish o1, Dish o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getCalories(), o2.getCalories());
			}
		});
		List<String> lowCaloricDishesName = new ArrayList<>();
		for (Dish d: lowCaloricDishes){
			lowCaloricDishesName.add(d.getName());
		}
		System.out.println(lowCaloricDishesName);
		
		/* stream() --> parallelStream() */
		List<String> lowCaloricDishesName2 = menu.stream().filter(d->d.getCalories()<400)
				.sorted(Comparator.comparing(Dish::getCalories))
				.map(Dish::getName)
				.collect(Collectors.toList());
		System.out.println(lowCaloricDishesName2);
		
		Map<Type,List<Dish>> dishesByType = menu.parallelStream().collect(Collectors.groupingBy(Dish::getType));
		System.out.println(dishesByType);
		System.out.println(Type.FISH.getClass());
	}
	
}
