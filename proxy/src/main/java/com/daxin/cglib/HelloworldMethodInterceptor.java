package com.daxin.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class HelloworldMethodInterceptor implements MethodInterceptor {

	public Object intercept(Object obj, Method m, Object[] objs, MethodProxy methodProxy) throws Throwable {
		
		System.out.println("前面日志记录完毕");
		Object result = methodProxy.invokeSuper(obj, objs);
		System.out.println("后面日志记录完毕");
		return result;
	}

}
