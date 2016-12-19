package com.daxin.singleton2;


/**
 * 
 * @author 青春常驻Dax1n
 * @version 1.0
 * 
 * 懒汉式：所谓懒汉式就是在需要时候在创建（符合懒人习惯）<br>
 * 该实现方式效率一般相对较低，不建议使用（设计同步问题）<br>
 * 做到了延迟加载<br>
 */
public class Singleton2 {
	
		//私有静态成员变量
		private static Singleton2 instance =null;

		//构造方法私有化
		private Singleton2() {
			 
		}
	
		//获取该单例的实例方法，做到了延迟加载，在第一次加载时候需要使用同步代码块，否则很容易出现线程安全问题
		//导致两个实例存在
		public static Singleton2 getInstance(){
			
		 if(instance==null){
			 synchronized (instance) {
				 instance=new Singleton2();
			}
		 }
			return instance;
		}
		
		
	
	
}
