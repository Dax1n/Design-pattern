package com.daxin.proxy.jdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainProxy {

	public static void main(String[] args) throws Exception {
		

		// Helloworld instance = (Helloworld)
		// Proxy.newProxyInstance(MainProxy.class.getClassLoader(), new
		// Class[]{Helloworld.class}, new MyInvocationHandler(new
		// HelloworldImpl()));
		// instance.sayHello();
		
		
		
		
		
		//-------------------------------------------------------------------
		
		// 生成HelloWorld的代理类：class com.sun.proxy.$Proxy0
		Class<?> proxyClass = Proxy.getProxyClass(MainProxy.class.getClassLoader(), Helloworld.class);

	
		//获取代理类参数为InvocationHandler的构造方法
		final Constructor<?> cons = proxyClass.getConstructor(InvocationHandler.class);
		
		
 
		
	
		// com.daxin.proxy.jdk.MyInvocationHandler
		final InvocationHandler ih = new HelloWorldInvocationHandler(new HelloworldImpl());

		// System.out.println(ih);

		// 代理类结构是继承至java.lang.reflect.Proxy，有个InvocationHandler成员属性。
		Helloworld helloWorld = (Helloworld) cons.newInstance(ih);
		
		
		
//		System.out.println(helloWorld);//这个输出的HelloWorldImpl，不正确，因为在InvocationHandler的invoke中调用的是HelloWorld实现类的toString
		
		
		System.out.println(helloWorld.getClass());

		helloWorld.sayHello();
		helloWorld.sayBye();
		
		 

	}

}


















