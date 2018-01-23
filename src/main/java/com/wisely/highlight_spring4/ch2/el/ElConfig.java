package com.wisely.highlight_spring4.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.el")
@PropertySource("classpath:com/wisely/highlight_spring4/ch2/el/test.properties")//ע�������ļ���ʹ��@PropertySourceָ���ļ���ַ
public class ElConfig {

	@Value("I Love You!")  //ע����ͨ�ַ���
	private String normal;
	
	@Value("#{systemProperties['os.name']}")  //ע�����ϵͳ����
	private String osName;
	
	@Value("#{ T(java.lang.Math).random() * 100.0}")  //ע����ʽ���	
	private double randomNumber;
	
	@Value("#{demoService.another}")	//ע������bean����
	private String fromAnother;
	
	@Value("classpath:com/wisely/highlight_spring4/ch2/el/test.txt")  //ע���ļ���Դ
	private Resource testFile;
	
	@Value("http://www.14rg2.com")  //ע����ַ��Դ
	private Resource testUrl;
	
	@Value("${book.name}")  //ע�������ļ�
	private String booName;
	
	/**
	 * ע�������ļ���ʹ��@PropertySourceָ���ļ���ַ
	 * ��ʹ��@Valueע��
	 * ��Ҫ����һ��PropertySourcesPlaceholderConfigurer��Bean
	 */
	@Autowired
	private Environment environment;
	
	public static PropertySourcesPlaceholderConfigurer propertyConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	public void outputResource(){
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);
			
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream()));
			System.out.println(booName);
			System.out.println(environment.getProperty("book.author"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
