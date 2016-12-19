package com.daxin.singleton2;


/**
 * 
 * @author �ഺ��פDax1n
 * @version 1.0
 * 
 * ����ʽ����ν����ʽ��������Ҫʱ���ڴ�������������ϰ�ߣ�<br>
 * ��ʵ�ַ�ʽЧ��һ����Խϵͣ�������ʹ�ã����ͬ�����⣩<br>
 * �������ӳټ���<br>
 */
public class Singleton2 {
	
		//˽�о�̬��Ա����
		private static Singleton2 instance =null;

		//���췽��˽�л�
		private Singleton2() {
			 
		}
	
		//��ȡ�õ�����ʵ���������������ӳټ��أ��ڵ�һ�μ���ʱ����Ҫʹ��ͬ������飬��������׳����̰߳�ȫ����
		//��������ʵ������
		public static Singleton2 getInstance(){
			
		 if(instance==null){
			 synchronized (instance) {
				 instance=new Singleton2();
			}
		 }
			return instance;
		}
		
		
	
	
}
