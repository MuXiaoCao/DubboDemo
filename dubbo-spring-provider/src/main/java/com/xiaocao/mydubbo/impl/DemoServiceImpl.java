package com.xiaocao.mydubbo.impl;

import com.xiaocao.mydubbo.DemoService;

public class DemoServiceImpl implements DemoService{

	@Override
	public String sayHello(String name) {
		return "hello" + name;
	}
	
}
