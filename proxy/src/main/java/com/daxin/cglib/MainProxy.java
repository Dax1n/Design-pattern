package com.daxin.cglib;

import com.daxin.proxy.jdk.Helloworld;
import com.daxin.proxy.jdk.HelloworldImpl;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.Mixin;

public class MainProxy {
	public static void main(String[] args) {

		HelloworldMethodInterceptor mi = new HelloworldMethodInterceptor();

		Enhancer enhancer = new Enhancer();

		// 设置生成字节码需要继承的类，因为要对HelloWorldImpl实现类进行增强，也可以对接口增强，使用其他api
		enhancer.setSuperclass(HelloworldImpl.class);

		enhancer.setCallback(mi);

		Helloworld helloworld = (Helloworld) enhancer.create();

		// helloworld为代理类
		// System.out.println(helloworld.getClass());

		helloworld.sayHello();

	}

}
