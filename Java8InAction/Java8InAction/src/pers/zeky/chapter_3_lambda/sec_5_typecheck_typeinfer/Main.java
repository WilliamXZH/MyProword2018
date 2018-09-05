package pers.zeky.chapter_3_lambda.sec_5_typecheck_typeinfer;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntBiFunction;

import pers.zeky.chapter_2.sec_1.Apple;

public class Main {
	
	public static void main(String[] args) {
			
		
		/* ͬ����Lambda����ͬ�ĺ���ʽ�ӿ� */
		Callable<Integer> c = ()->42;
		PrivilegedAction<Integer> p = ()->42;
		
		
		Comparator<Apple> c1 = (Apple a1,Apple a2)->a1.getWeight().compareTo(a2.getWeight());
		ToIntBiFunction<Apple,Apple> c2 = (Apple a1,Apple a2)->a1.getWeight().compareTo(a2.getWeight()); 
		BiFunction<Apple,Apple,Integer> c3 = (Apple a1,Apple a2)->a1.getWeight().compareTo(a2.getWeight());
		
		List<String> list = new ArrayList<>();
		//Predicate������һ��boolean
		Predicate<String> p2 = s->list.add(s);
		Consumer<String> b2 = s->list.add(s);
		
		if (p2.test("123")){
			b2.accept("asd");
		}
		System.out.println(list);
		
		Integer i = 0;
		Function<Integer,Integer> f1 = a->{return a+i;}; 
		Consumer<Integer> f2 = j->j++;
		Supplier<Integer> f3 = ()->i; 
		System.out.println(f1.apply(i));
		f2.accept(i);
		System.out.println(f3.get());
		
		/* û�������ƶ� */
		Comparator<Apple> cp = (Apple a1,Apple a2)->a1.getWeight().compareTo(a2.getWeight());
		/* �������ƶ� */
		Comparator<Apple> cp2 = (a1,a2)->a1.getWeight().compareTo(a2.getWeight());
		
		int portNumber = 1337;
		Runnable r = ()->System.out.println(portNumber);
		new Thread(r).start();
		//portNumber++;//���������ϵ�final
	}

}
