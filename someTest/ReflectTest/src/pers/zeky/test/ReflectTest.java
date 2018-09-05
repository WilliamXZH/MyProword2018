package pers.zeky.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import pers.zeky.main.ReflectUtil;

public class ReflectTest {
	
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Object o = String.class;
		
		Method method = ReflectUtil.getDeclaredMethod(o, "toString");
		
		try {
			System.out.println(method.invoke(o));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(new Object().getClass().getDeclaredMethods()[0]);
		
		
		
		
		Class c = Object.class;
		try {
			Method m = c.getMethod("toString");
			System.out.println(m.invoke(c));
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
