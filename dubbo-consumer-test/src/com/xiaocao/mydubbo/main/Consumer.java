package com.xiaocao.mydubbo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaocao.mydubbo.DemoService;

public class Consumer {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "consumer.xml" });
		context.start();
		DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
	    String hello = demoService.sayHello("  dubbo "); // 执行远程方法
	    context.close();
		System.out.println(hello);
	}
}
