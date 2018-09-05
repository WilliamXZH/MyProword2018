package pers.zeky.chapter_2.sec_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import pers.zeky.chapter_2.sec_1.Apple;

public class ComparatorTest {

	public static void main(String[] args) {
		
		List<Apple> inventory = new ArrayList<>();
		
		inventory.sort(new Comparator<Apple>(){

			@Override
			public int compare(Apple o1, Apple o2) {
				// TODO Auto-generated method stub
				return o1.getWeight().compareTo(o2.getWeight());
			}
			
		});
		
		inventory.sort((Apple a1,Apple a2)->a1.getWeight().compareTo(a2.getWeight()));
		
		Thread t = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello world");
			}
			
		});
		
		Thread t2 = new Thread(()->{System.out.println("Hello World!");});
	}
	
}
