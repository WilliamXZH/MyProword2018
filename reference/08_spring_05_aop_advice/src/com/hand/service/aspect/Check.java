package com.hand.service.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Check {

	public void checkValidity() {
		System.out.println("------------------Permission Validation------");
	}

	public void addLog(){
		System.out.println("------------------Add the log----------------");
	}

	public void testAround(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("------------------before around----------------");
		Object retVal1 = pjp.proceed();
		System.out.println("------------------testAround return "+retVal1+"-");
		System.out.println("------------------after  around----------------");
	}
	
	
	public void testAfterReturning(Object retValue){
		System.out.println("------------------After Returning----------------");
		System.out.println("------------------testAfterReturning  return"+retValue+"--");
	}

}
