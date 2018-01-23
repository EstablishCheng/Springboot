package com.wisely.highlight_spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

	@PostConstruct	//�ڹ��캯��ִ����֮��ִ��
	public void init(){
		System.out.println("JSR250-init-method");
	}
	
	public JSR250WayService(){
		super();
		System.out.println("��ʼ�����캯��-JSR250WayService");
	}
	
	@PreDestroy	//��Bean����֮ǰִ��
	public void destroy(){
		System.out.println("JSR250-destroy-method");
	}
}
