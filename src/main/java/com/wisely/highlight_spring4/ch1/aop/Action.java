package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 编写拦截规则的注解
 * @author chengli
 *
 */
@Target(ElementType.METHOD)//用于设定注解使用范围
@Retention(RetentionPolicy.RUNTIME)//注解的保留位置
public @interface Action {

	String name();
}
