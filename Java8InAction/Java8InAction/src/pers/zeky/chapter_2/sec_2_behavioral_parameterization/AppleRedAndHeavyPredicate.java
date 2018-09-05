package pers.zeky.chapter_2.sec_2_behavioral_parameterization;

import pers.zeky.chapter_2.sec_1.Apple;

public class AppleRedAndHeavyPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return "red".equals(apple.getColor())
				&&apple.getWeight()>150;
	}

}
