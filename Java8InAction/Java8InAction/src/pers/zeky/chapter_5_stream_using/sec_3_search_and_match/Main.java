package pers.zeky.chapter_5_stream_using.sec_3_search_and_match;

import java.util.List;
import java.util.Optional;

import pers.zeky.chapter_4_leadin_stream.sec_2_stream_summary.Dish;
import pers.zeky.util.Menu;

/* anyMatch、allMatch、noneMatch */
public class Main {

	public static void main(String[] args) {
		
		List<Dish> menu = Menu.getMenu();
		
		/* 至少有一个匹配 */
		if (menu.stream().anyMatch(Dish::isVegetarian)){
			System.out.println("The menu is (somewhat) vegetarian frendly!!");
		}
		/* 匹配所有 */
		boolean isHealthy = menu.stream()
				.allMatch(d->d.getCalories()<1000);
		/* 没有任何元素与之匹配 */
		boolean isHealthy2 = menu.stream()
				.noneMatch(d->d.getCalories()>=1000);
		
		Optional<Dish> dish = menu.stream()
				.filter(Dish::isVegetarian)
				.findAny();
		System.out.println(dish);
		
		/**
		 * Optional
		 * isPresent() 是否包含值
		 * ifPresent(Consumer<T> block) 值存在时执行给定代码
		 * T get() 值存在时返回值
		 * T orElse(T other) 值存在时返回值，否则返回默认值
		 */
		menu.stream().filter(Dish::isVegetarian).findAny()
				.ifPresent(d->System.out.println(d.getName()));
		
	}
	
}
