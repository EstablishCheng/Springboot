package com.wisely.highlight_spring4.ch3.taskexecute;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.taskexecute")
@EnableAsync	//利用@EnableAsync注解开启异步任务支持
public class TaskExecuteConfig implements AsyncConfigurer{

	@Override
	public Executor getAsyncExecutor() {	//配置类实现AsyncConfigurer接口并重写getAsyncExecutor方法
				//并返回一个ThreadPoolTaskExecutor，这样我们就获得一个机遇线程池taskExecutor
		ThreadPoolTaskExecutor taskExecutor = 
				new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);
		taskExecutor.setMaxPoolSize(10);
		taskExecutor.setQueueCapacity(25);
		taskExecutor.initialize();
		return taskExecutor;
	}

	@Override
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}

	
}
