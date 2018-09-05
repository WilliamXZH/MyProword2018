package pers.zeky.chapter_1.sec1_why;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class AppleTest {

	public static void main(String[] args) {
		
		List<Apple> inv = new ArrayList<>();
		inv.add(new Apple(3));
		inv.add(new Apple(5));
		inv.add(new Apple(1));
		
		//inv = new AppleTest().oldMethod(inv);
		inv = new AppleTest().newMethod(inv);
		
		inv.forEach(new Consumer<Apple>(){

			@Override
			public void accept(Apple t) {
				System.out.println(t.getWeight());
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}
	
	public List<Apple> oldMethod(List<Apple> inventory){
		
		Collections.sort(inventory,new Comparator<Apple>(){

			@Override
			public int compare(Apple o1, Apple o2) {
				// TODO Auto-generated method stub
				return o1.getWeight().compareTo(o2.getWeight());
			}
			
			/*@Override
			public int compare(Apple a1, Apple a2){
				return a1.getWeight().compareTo(a2.getWeight());
			}*/
		});
		
		return inventory;
		
	}
	
	
	public List<Apple> newMethod(List<Apple> inventory){
		
		inventory.sort(Comparator.comparing(Apple::getWeight));
//		inventory.sort(Apple::compareTo);
//		inventory.sort((Apple a,Apple b)->a.getWeight().compareTo(b.getWeight()));
		
		/* error */
		//inventory.sort(compare(Apple::getWeight));
		
		return inventory;
		
	}
	
}
