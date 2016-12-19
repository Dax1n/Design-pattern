package com.daxin.singleton3;


/**
 * 
 * @author �ഺ��פDax1n
 * @version 1.0
 * 
 *          <br>
 *          �ڲ���ʵ�ַ�ʽ��ѣ����漰ͬ��������
 * 
 */

public class Singleton3 {

	// ˽�л�������
	private Singleton3() {

	}

	//�������ӳټ��ء�
	//ֻ����getInstance����������ʱ��JVM�Ż����Holder��
	static class Holder {
		private static Singleton3 instance = new Singleton3();
	}

	
	public static Singleton3 getInstance() {
		return Holder.instance;
	}
	
	
	
	

}
