package com.wisely.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

	@Bean
	@Profile("dev")	//Profile为dev实例化DevDemoBean
	public DemoBean devDemoBean(){
		return new DemoBean("from development profile");
	}
	
	@Bean
	@Profile("prod")	//Profile为prod实例化prodDemoBean
	public DemoBean prodDemoBean(){
		return new DemoBean("from production profile");
	}
}
