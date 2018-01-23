package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * 编写使用注解的被拦截类
 * @author chengli
 *
 */
@Service
public class DemoAnnotationService {

	@Action(name="注解式拦截的add操作")
	public void add(){}
}
