package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AopConfig.class);//作为一个容器，接受一个配置类作为参数
		DemoAnnotationService demoAnnotationService = 
				context.getBean(DemoAnnotationService.class);
		DemoMethodService demoMethodService = 
				context.getBean(DemoMethodService.class);
		demoAnnotationService.add();
		demoMethodService.add();
		context.close();
		
	}
}
