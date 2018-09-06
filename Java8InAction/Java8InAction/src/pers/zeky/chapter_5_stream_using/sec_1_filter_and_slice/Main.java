package pers.zeky.chapter_5_stream_using.sec_1_filter_and_slice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import pers.zeky.chapter_4_leadin_stream.sec_2_stream_summary.Dish;
import pers.zeky.util.Menu;

public class Main {

	
	public static void main(String[] args) {
		
		List<Dish> menu = Menu.getMenu();
		/* ɸѡ��---filter */
		List<Dish> vegetarianMenu = menu.parallelStream()
				.filter(Dish::isVegetarian)
				.collect(Collectors.toList());
		/* ɸѡ����---distinct */
		List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);
		numbers.parallelStream().filter(i->i%2==0).distinct()
				.forEach(System.out::println);
		/* �ض�---limit */
		List<Dish> dishes = menu.parallelStream()
				.filter(d->d.getCalories()>300)
				.limit(3)
				.collect(Collectors.toList());
		/* ����Ԫ�� */
		List<Dish> dishes2 = menu.parallelStream()
				.filter(d->d.getCalories()>300)
				.skip(2)
				.collect(Collectors.toList());
		
		
	}
}
