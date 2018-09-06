package pers.zeky.chapter_5_stream_using.sec_3_search_and_match;

import java.util.List;
import java.util.Optional;

import pers.zeky.chapter_4_leadin_stream.sec_2_stream_summary.Dish;
import pers.zeky.util.Menu;

/* anyMatch��allMatch��noneMatch */
public class Main {

	public static void main(String[] args) {
		
		List<Dish> menu = Menu.getMenu();
		
		/* ������һ��ƥ�� */
		if (menu.stream().anyMatch(Dish::isVegetarian)){
			System.out.println("The menu is (somewhat) vegetarian frendly!!");
		}
		/* ƥ������ */
		boolean isHealthy = menu.stream()
				.allMatch(d->d.getCalories()<1000);
		/* û���κ�Ԫ����֮ƥ�� */
		boolean isHealthy2 = menu.stream()
				.noneMatch(d->d.getCalories()>=1000);
		
		Optional<Dish> dish = menu.stream()
				.filter(Dish::isVegetarian)
				.findAny();
		System.out.println(dish);
		
		/**
		 * Optional
		 * isPresent() �Ƿ����ֵ
		 * ifPresent(Consumer<T> block) ֵ����ʱִ�и�������
		 * T get() ֵ����ʱ����ֵ
		 * T orElse(T other) ֵ����ʱ����ֵ�����򷵻�Ĭ��ֵ
		 */
		menu.stream().filter(Dish::isVegetarian).findAny()
				.ifPresent(d->System.out.println(d.getName()));
		
	}
	
}
