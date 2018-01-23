package com.wisely.highlight_spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {

	private static final SimpleDateFormat DATE_FORMAT = 
			new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)	//通过@Scheduled声明该方法是计划任务，使用fixedRate属性每隔固定时间执行
	public void reportCurrentTime(){
		System.out.println("每5秒执行一次："+DATE_FORMAT.format(new Date()));
	}
	
	@Scheduled(cron = "0 24 15 ? * * ")	//使用cron属性可按照指定时间执行，该处为15点18分执行
										//cron是UNIX和类UNIX（Linux）系统下的定时任务
	public void fixTimeExecution(){
		System.out.println("在指定时间 " + DATE_FORMAT.format(new Date()) + "执行");
	}
}
