package com.xiaocao.mydubbo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaocao.mydubbo.DemoService;

public class Consumer {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "consumer.xml" });
		context.start();
		DemoService demoService = (DemoService)context.getBean("demoService"); // ��ȡԶ�̷������
	    String hello = demoService.sayHello("  dubbo "); // ִ��Զ�̷���
	    context.close();
		System.out.println(hello);
	}
}
