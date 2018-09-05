package pers.zeky.chapter_3_lambda.sec_7_inAction;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import pers.zeky.chapter_2.sec_1.Apple;

public class Main {

	public static void main(String[] args) {
		
		List<Apple> inventory = Arrays.asList(new Apple(12),
				new Apple(34),new Apple(19),new Apple(23));
		
		inventory.sort(new AppleComparator().reversed());
		System.out.println(inventory);
		
		inventory.sort(new Comparator<Apple>(){

			@Override
			public int compare(Apple o1, Apple o2) {
				// TODO Auto-generated method stub
				return o1.getWeight().compareTo(o2.getWeight());
			}
			
		});
		System.out.println(inventory);
		inventory.sort((Apple a1,Apple a2)->a1.getWeight().compareTo(a2.getWeight()));
		inventory.sort((a1,a2)->a1.getWeight().compareTo(a2.getWeight()));
		Collections.reverse(inventory);
		System.out.println(inventory);
		inventory.sort(Comparator.comparing((Apple a)->a.getWeight()));
		inventory.sort(comparing(a->a.getWeight()));
		System.out.println(inventory);
		
		inventory.sort(comparing(Apple::getWeight));
		
	}
	
}
