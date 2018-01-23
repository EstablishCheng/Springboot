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
@EnableAsync	//����@EnableAsyncע�⿪���첽����֧��
public class TaskExecuteConfig implements AsyncConfigurer{

	@Override
	public Executor getAsyncExecutor() {	//������ʵ��AsyncConfigurer�ӿڲ���дgetAsyncExecutor����
				//������һ��ThreadPoolTaskExecutor���������Ǿͻ��һ�������̳߳�taskExecutor
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