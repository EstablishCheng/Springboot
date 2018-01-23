package com.wisely.highlight_spring4.ch3.taskexecute;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TaskExecuteConfig.class);
		
		AsyncTaskService asyncTaskService = 
				context.getBean(AsyncTaskService.class);
		
		for (int i = 0; i < 10; i++) {
			asyncTaskService.executeAsyncTask(i);
			asyncTaskService.executeAsyncTaskPlus(i);
		}
	}

}
