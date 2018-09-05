package pers.zeky.chapter_3_lambda.sec_7_inAction;

import java.util.Comparator;

import pers.zeky.chapter_2.sec_1.Apple;

public class AppleComparator implements Comparator<Apple>{

	@Override
	public int compare(Apple o1, Apple o2) {
		// TODO Auto-generated method stub
		return o1.getWeight().compareTo(o2.getWeight());
	}
	

}
