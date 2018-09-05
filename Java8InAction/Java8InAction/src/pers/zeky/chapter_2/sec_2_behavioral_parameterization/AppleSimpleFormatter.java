package pers.zeky.chapter_2.sec_2_behavioral_parameterization;

import pers.zeky.chapter_2.sec_1.Apple;

public class AppleSimpleFormatter implements AppleFormatter {

	@Override
	public String accept(Apple a) {
		// TODO Auto-generated method stub
		return "An apple of "+a.getWeight()+"g";
	}

}
