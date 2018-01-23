package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

//ʵ��ApplicationListener�ӿڣ���ָ���������¼�����
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	//ʹ��onApplicationEvent��������Ϣ���н��մ���
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		
		System.out.println("��(bean-demoListener)���ܵ���bean-demoPublisher��������Ϣ��"+ msg);
	}

}
