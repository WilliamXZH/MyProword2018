package pers.zeky.chapter_5_stream_using.sec_4_reduce;

import java.util.List;

import pers.zeky.chapter_4_leadin_stream.sec_2_stream_summary.Dish;
import pers.zeky.util.Menu;

public class ReduceTest {
	
	public static void main(String[] args) {
		List<Dish> menu = Menu.getMenu(); 
		int count = menu.stream()
						.map(d->1)
						.reduce(0,(a,b)->a+b);
		System.out.println(count);
	}

}
