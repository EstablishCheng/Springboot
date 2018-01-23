package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ��д���ع����ע��
 * @author chengli
 *
 */
@Target(ElementType.METHOD)//�����趨ע��ʹ�÷�Χ
@Retention(RetentionPolicy.RUNTIME)//ע��ı���λ��
public @interface Action {

	String name();
}
