package com.daxin.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloWorldInvocationHandler implements InvocationHandler {

	private Helloworld agent;

	public HelloWorldInvocationHandler(Helloworld agent) {
		super();
		this.agent = agent;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
//		sayLove();//此处也可以调用sayLove等增强方法
		
		System.out.println("前面日志记录完毕");
		Object result = method.invoke(agent, args);
		System.out.println("后面日志记录完毕");

		return result;
	}

	public void sayLove() {
		System.out.println("I love you !");

	}

}
