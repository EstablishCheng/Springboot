package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * ��дʹ��ע��ı�������
 * @author chengli
 *
 */
@Service
public class DemoAnnotationService {

	@Action(name="ע��ʽ���ص�add����")
	public void add(){}
}