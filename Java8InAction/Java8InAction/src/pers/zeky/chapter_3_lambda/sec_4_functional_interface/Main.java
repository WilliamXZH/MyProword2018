package pers.zeky.chapter_3_lambda.sec_4_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static <T> List<T> filter(List<T> list, Predicate<T> p){
		List<T> results = new ArrayList<>();
		for (T s :list){
			if (p.test(s)){
				results.add(s);
			}
		}
		return results;
	}
	public static <T> void forEach(List<T> list, Consumer<T> c){
		for (T i:list){
			c.accept(i);
		}
	}
	public static <T,R> List<R> map(List<T> list, Function<T,R> f){
		List<R> result = new ArrayList<>(); 
		for (T s:list){
			result.add(f.apply(s));
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("123","abc","!@#","<>?");
		
		Predicate<String> nonEmptyStringPredicate = (String s)->!s.isEmpty();
		List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);
		System.out.println(nonEmpty);
		
		forEach(Arrays.asList(1,2,3,4,5), (Integer i)->System.out.println(i));
		
		List<Integer> l = map(Arrays.asList("lambdas","in","action"),(String s)->s.length());
	}

}
