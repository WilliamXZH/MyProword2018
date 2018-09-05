package pers.zeky.chapter_3_lambda.sec_6_method_citation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import pers.zeky.chapter_1.sec3_stream.Transaction;
import pers.zeky.chapter_2.sec_1.Apple;

public class Main {

	public static void main(String[] args) {
		Apple[] apples = {new Apple(123,""),new Apple(3412,"")};
		List<Apple> inventory = Arrays.asList(apples);
		inventory.sort(Comparator.comparing(Apple::getWeight));
		
		Function<Apple,Integer> f = a->a.getWeight();
		Function<Apple,Integer> f2 = Apple::getWeight;
		Thread.currentThread();
		Runnable r = ()->Thread/*.currentThread()*/.dumpStack();
		Runnable r2 = Thread/*.currentThread()*/::dumpStack;
		BiFunction<String,Integer,String> bf = (str,i)->str.substring(i);
		BiFunction<String,Integer,String> bf2 = String::substring;
		Consumer<String> c = (s)->System.out.println(s) ;
		Consumer<String> c2 = System.out::println;
		
		StaticInterface<String,Integer> si = Integer::parseInt;
		System.out.println(si.test("123123"));
		StaticInterface<String,Integer> si2 = String::length;
		System.out.println(si2.test(""));
		
		//TransactionWrapper expensiveTransaction = (TransactionWrapper) Class.forName("TransactionWrapper").newInstance();
		TransactionWrapper expensiveTransaction = new TransactionWrapper(new Transaction());
		Supplier<Transaction> si3 = expensiveTransaction::getValue;
		
		
		List<String> str = Arrays.asList("a","b","A","B");
		str.sort((s1,s2)->s1.compareToIgnoreCase(s2));
		str.sort(String::compareToIgnoreCase);
		str.sort(String::compareTo);
		System.out.println(str);
		
		Function<String,Integer> stringToInteger = (String s)->Integer.parseInt(s);
		Function<String,Integer> stringToInteger2 = Integer::parseInt;
		
		BiPredicate<List<String>,String> contains = (list,element)->list.contains(element);
		BiPredicate<List<String>,String> contains2 = List::contains;
		
		
	}
	
}
