package com.wisely.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

	//ͨ��@Conditionalע�⣬����Windows/Linux������ʵ����windowsListService/linuxListService
	
	@Bean
	@Conditional(WindowsCondition.class)
	public ListService windowsListService(){
		return new WindowsListService();
	}
	
	@Bean
	@Conditional(WindowsCondition.class)
	public ListService linuxListService(){
		return new WindowsListService();
	}
	
	
}
