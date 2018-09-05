package pers.zeky.chapter_2.sec_3_anonymous_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import pers.zeky.chapter_2.sec_1.Apple;

public class ListAbstractTest {

	public static  <T> List<T> filter(List<T> list, Predicate<T> p){
		List<T> result = new ArrayList<>();
		for (T e:list){
			if (p.test(e)){
				result.add(e);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		
		List<Apple> inventory = new ArrayList<>();
		List<Apple> redApples = filter(inventory ,(Apple apple)->"red".equals(apple.getColor()));
		System.out.println(redApples);
		
		List<Integer> numbers =  Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> evenNumber = filter(numbers ,(Integer i)->i%2==0);
		System.out.println(evenNumber);
	}
}
