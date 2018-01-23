package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //ע�⵱ǰ����һ��������
public class JavaConfig {

	@Bean //ʹ��@beanע��������ǰ����function�Ƿ���һ��bean
	public FunctionService functionService(){
		return new FunctionService();
	}
	
	@Bean
	public UseFunctionService useFunctionService(){
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}
	
//	@Bean
//	public UseFunctionService useFunctionService(FunctionService functionService){
//		UseFunctionService useFunctionService = new UseFunctionService();
//		useFunctionService.setFunctionService(functionService);
//		return useFunctionService;
//	}
	
}
