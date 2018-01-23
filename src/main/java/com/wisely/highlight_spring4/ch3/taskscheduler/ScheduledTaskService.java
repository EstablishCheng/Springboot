package com.wisely.highlight_spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {

	private static final SimpleDateFormat DATE_FORMAT = 
			new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)	//ͨ��@Scheduled�����÷����Ǽƻ�����ʹ��fixedRate����ÿ���̶�ʱ��ִ��
	public void reportCurrentTime(){
		System.out.println("ÿ5��ִ��һ�Σ�"+DATE_FORMAT.format(new Date()));
	}
	
	@Scheduled(cron = "0 24 15 ? * * ")	//ʹ��cron���Կɰ���ָ��ʱ��ִ�У��ô�Ϊ15��18��ִ��
										//cron��UNIX����UNIX��Linux��ϵͳ�µĶ�ʱ����
	public void fixTimeExecution(){
		System.out.println("��ָ��ʱ�� " + DATE_FORMAT.format(new Date()) + "ִ��");
	}
}
