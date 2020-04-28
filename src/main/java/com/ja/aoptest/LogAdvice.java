package com.ja.aoptest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAdvice {
	
	public void testttt() {
		System.out.println("ttttttt");
	}
	
	public void printLog(JoinPoint jp) {
		//System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
		//메소드 이름 찍히게
		String methodName = jp.getSignature().getName();
		System.out.println(methodName + "] 메소드 실행 전");
	}
	
	public void printafterLog(JoinPoint jp) {
		//System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
		//메소드 이름 찍히게
		String methodName = jp.getSignature().getName();
		System.out.println(methodName + "] 메소드 실행 후");
	}
	
	//aop:around는 프로씨딩조인포인트 받아야한다!
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
		
		String name = pjp.getSignature().getName();
		
		System.out.println(name + " 실행 전");
		
		//try-catch 써야함.
		Object obj = pjp.proceed();
		
		System.out.println(name + " 실행 후");
		
		return obj;
	}
	
}
