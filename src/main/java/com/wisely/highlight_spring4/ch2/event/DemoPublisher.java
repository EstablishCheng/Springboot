package com.wisely.highlight_spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {

	@Autowired
	ApplicationContext applicationContext;	//注入applicationcontext用来发布事件
	
	public void publish(String msg){
		//使用ApplicationContext的publishEvent方法来发布
		applicationContext.publishEvent(new DemoEvent(this,msg));
	}
}
