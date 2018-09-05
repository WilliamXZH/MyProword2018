package pers.zeky.main;

import java.util.Optional;
import java.util.function.Predicate;

import javax.swing.text.html.Option;

public class OptionalTest {
	
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();
		
		Optional<Object> opt = Optional.of(o1);
		Optional<Object> opt2 = Optional.empty();
		System.out.println(opt);
		System.out.println(opt.equals(new Object()));
		//System.out.println(opt.filter());
		
		
		Integer value1 = null;
		Integer value2 = new Integer(10);
		
		
		//Optional.ofNullable - 允许传递为null参数
		Optional<Integer> a = Optional.ofNullable(value1);
		
		//Optional.of - 如果传递的参数是null，抛出异常NullPointerException
		Optional<Integer> b = Optional.of(value2);
		System.out.println(sum(a,b));
		
		
		
	}

	
	public static Integer sum(Optional<Integer> a, Optional<Integer> b){
		
		//Optional.isPresent - 判断值是否存在
		
		
		System.out.println("第一个参数值村存在" + a.isPresent());
		System.out.println("第一个参数值村存在" + b.isPresent());
		
		//Optional.orElse - 如果值存在，返回它，否则返回默认值
		Integer value1 = a.orElse(new Integer(0));
		
		//Option.get - 获取值，值需要存在
		Integer value2 = b.get();
		return value1 + value2;
		
	}
}
