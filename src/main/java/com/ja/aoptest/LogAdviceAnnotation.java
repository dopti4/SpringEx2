package com.ja.aoptest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service	//어노테이션으로 로그 찍는 방법.
@Aspect
public class LogAdviceAnnotation {
	
	//이걸 아이디로 쓸 거다.
	@Pointcut("execution(* com.ja.aoptest..*Impl.*(..))")	//어떤 메소드들이 포인트컷이 될 건지
	public void allPointcut() {}
	
//	@Pointcut("execution(* com..*Impl.*(..))")	//어떤 메소드들이 포인트컷이 될 건지
//	public void xxxx() {}
	
	@Before("allPointcut()")
	public void printLog(JoinPoint jp) {
		System.out.println(jp.getSignature().getName() + "] 실행 전");
	}
	
}
