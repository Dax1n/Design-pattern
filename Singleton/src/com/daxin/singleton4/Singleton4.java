package com.daxin.singleton4;

import java.io.Serializable;


/**
 * @author 青春常驻Dax1n
 * <br>
 * 这个主要区别是：单例类实现了序列化结构，所以如果对单例对象序列化之后在反序列化你会发现两个实例根本不是一个实例
 *
 */
public class Singleton4  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	//私有静态成员变量，在Singleton1字节码加载时候被初始化
	private static Singleton4 instance =new Singleton4();
	
	//构造方法私有化
	private Singleton4() {
	
	}
	

	//获取该单例的实例方法
	public static Singleton4 getInstance(){
		
		return instance;
	}

	
	/**
	 * 该方法由jvm调用
	 * <br>这个对象有否决定序列化是否是一个实例，内部实现机制：大概就是在反序列化一个对象时候
	 * <br>JVM会检查该对象是否有readResolve方法，没有的话则返回通过反序列的对象，有的话返回readResolve指定的对象
	 * @return 返回指定的对象
	 * 
	 */
	public Object readResolve(){
		return instance;
	}
	
	
	
}
