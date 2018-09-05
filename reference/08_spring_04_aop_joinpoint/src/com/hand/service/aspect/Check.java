package com.hand.service.aspect;

import org.aspectj.lang.JoinPoint;

public class Check{

	public void checkValidity() {
		System.out.println("------------------Permission Validation------");

	}

	public void addLog(JoinPoint joinPoint) {
		System.out.println("------------------Add the log----------------");
		
		
		Object obj[] = joinPoint.getArgs();
		for (Object o : obj) {
			System.out.println(o);
		}

		System.out.println("------------target method name is "
				+ joinPoint.getSignature().getName()+"--------");
	}

}
