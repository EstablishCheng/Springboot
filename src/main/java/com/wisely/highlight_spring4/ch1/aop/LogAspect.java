package com.wisely.highlight_spring4.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect		//����һ������
@Component	//�ô������ΪSpring���������Bean
public class LogAspect {

	//�����е�
	@Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)")
	public void annotationPointCut(){};
	
	@After("annotationPointCut()")//����һ�����ԣ���ʹ��@pointCut������е�
	public void after(JoinPoint joinPoint){
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		Method method = methodSignature.getMethod();
		Action action = method.getAnnotation(Action.class);
		//ͨ������ɻ��ע���ϵ����ԣ�Ȼ����Ϊ��־�ļ���¼��صĲ���
		System.out.println("ע��ʽ����,"+ action.name());
	}
	
	//����һ�����ԣ��˽���ֱ��ʹ�����ع�����Ϊ����
	@Before("execution(* com.wisely.highlight_spring4.ch1.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		Method method = methodSignature.getMethod();
		System.out.println("��������ʽ����,"+ method.getName());
	}
	
}
