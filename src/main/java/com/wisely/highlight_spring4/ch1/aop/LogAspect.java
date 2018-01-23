package com.wisely.highlight_spring4.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect		//声明一个切面
@Component	//让此切面成为Spring容器管理的Bean
public class LogAspect {

	//声明切点
	@Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)")
	public void annotationPointCut(){};
	
	@After("annotationPointCut()")//声明一个建言，并使用@pointCut定义的切点
	public void after(JoinPoint joinPoint){
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		Method method = methodSignature.getMethod();
		Action action = method.getAnnotation(Action.class);
		//通过反射可获得注解上的属性，然后作为日志文件记录相关的操作
		System.out.println("注解式拦截,"+ action.name());
	}
	
	//声明一个建言，此建言直接使用拦截规则作为参数
	@Before("execution(* com.wisely.highlight_spring4.ch1.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		Method method = methodSignature.getMethod();
		System.out.println("方法规则式拦截,"+ method.getName());
	}
	
}
