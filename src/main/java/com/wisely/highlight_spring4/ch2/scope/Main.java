package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ScopeConfig.class);//接受一个配置类作为参数
		
		DemoSingletonService s1 = context.getBean(DemoSingletonService.class);//获得声明配置的bean
		DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
		
		DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
		
		System.out.println("s1=s2?"+s1.equals(s2));
		System.out.println("p1=p2?"+p1.equals(p2));
		
	}

}
