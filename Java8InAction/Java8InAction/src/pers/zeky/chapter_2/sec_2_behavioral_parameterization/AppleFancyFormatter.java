package pers.zeky.chapter_2.sec_2_behavioral_parameterization;

import pers.zeky.chapter_2.sec_1.Apple;

public class AppleFancyFormatter implements AppleFormatter {

	@Override
	public String accept(Apple a) {
		String characteristic = a.getWeight()>150?"heavy":"light";
		// TODO Auto-generated method stub
		return "A "+characteristic+" "+a.getColor()+" apple";
	}

}
