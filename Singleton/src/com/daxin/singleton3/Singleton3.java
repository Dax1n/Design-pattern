package com.daxin.singleton3;


/**
 * 
 * @author 青春常驻Dax1n
 * @version 1.0
 * 
 *          <br>
 *          内部类实现方式最佳：不涉及同步问题呢
 * 
 */

public class Singleton3 {

	// 私有化构造器
	private Singleton3() {

	}

	//做到了延迟加载。
	//只有在getInstance方法被调用时候JVM才会加载Holder。
	static class Holder {
		private static Singleton3 instance = new Singleton3();
	}

	
	public static Singleton3 getInstance() {
		return Holder.instance;
	}
	
	
	
	

}
