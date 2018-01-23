package com.wisely.highlight_spring4.ch3.taskexecute;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

	/*
	 * ͨ��@Asyncע������÷����Ǹ��첽���������ע�����༶��������������еķ��������첽����
	 * ���ע�����༶��������������еķ��������첽������������ķ����Զ���ע��ʹ��ThreadPoolTaskExecutor��ΪTaskExecutor
	 */
	@Async
	public void executeAsyncTask(Integer i){
		System.out.println("ִ���첽����"+i);
	}
	
	@Async
	public void executeAsyncTaskPlus(Integer i){
		System.out.println("ִ���첽����+1��"+i);
	}
}
