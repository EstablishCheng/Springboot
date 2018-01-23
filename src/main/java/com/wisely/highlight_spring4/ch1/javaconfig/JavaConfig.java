package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //注解当前类是一个配置类
public class JavaConfig {

	@Bean //使用@bean注解声明当前方法function是返回一个bean
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
