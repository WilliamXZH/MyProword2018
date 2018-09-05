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
		
		
		//Optional.ofNullable - ������Ϊnull����
		Optional<Integer> a = Optional.ofNullable(value1);
		
		//Optional.of - ������ݵĲ�����null���׳��쳣NullPointerException
		Optional<Integer> b = Optional.of(value2);
		System.out.println(sum(a,b));
		
		
		
	}

	
	public static Integer sum(Optional<Integer> a, Optional<Integer> b){
		
		//Optional.isPresent - �ж�ֵ�Ƿ����
		
		
		System.out.println("��һ������ֵ�����" + a.isPresent());
		System.out.println("��һ������ֵ�����" + b.isPresent());
		
		//Optional.orElse - ���ֵ���ڣ������������򷵻�Ĭ��ֵ
		Integer value1 = a.orElse(new Integer(0));
		
		//Option.get - ��ȡֵ��ֵ��Ҫ����
		Integer value2 = b.get();
		return value1 + value2;
		
	}
}
