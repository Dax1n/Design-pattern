package com.daxin.singleton1;

/**
 * 
 * @author 青春常驻Dax1n
 * @version 1.0
 *<br>
 * 饿汉式：所谓饿汉式就是不管需不需都先创建了再说，这种方式不能做到延迟加载。<br>
 * 这种方式最简单，效率也最高。（不涉及同步代码块问题）<br>
 * JDK源码中Runtime的currentRuntime就是单例，就是饿汉式实现<br>
 * 建议：<br>
 * 笔试题目呀一般不建议写这个，这个简单。不能拉开差距！
 */
public class Singleton1 {
	
	//私有静态成员变量，在Singleton1字节码加载时候被初始化
	private static Singleton1 instance =new Singleton1();
	
	//构造方法私有化
	private Singleton1() {
	
	}
	

	//获取该单例的实例方法
	public static Singleton1 getInstance(){
		
		return instance;
	}

	public static void main(String[] args) {
		
		
		 
		
	}
	
}
