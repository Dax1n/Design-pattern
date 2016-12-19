package com.daxin.singleton4;

import java.io.Serializable;


/**
 * @author �ഺ��פDax1n
 * <br>
 * �����Ҫ�����ǣ�������ʵ�������л��ṹ����������Ե����������л�֮���ڷ����л���ᷢ������ʵ����������һ��ʵ��
 *
 */
public class Singleton4  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	//˽�о�̬��Ա��������Singleton1�ֽ������ʱ�򱻳�ʼ��
	private static Singleton4 instance =new Singleton4();
	
	//���췽��˽�л�
	private Singleton4() {
	
	}
	

	//��ȡ�õ�����ʵ������
	public static Singleton4 getInstance(){
		
		return instance;
	}

	
	/**
	 * �÷�����jvm����
	 * <br>��������з�������л��Ƿ���һ��ʵ�����ڲ�ʵ�ֻ��ƣ���ž����ڷ����л�һ������ʱ��
	 * <br>JVM����ö����Ƿ���readResolve������û�еĻ��򷵻�ͨ�������еĶ����еĻ�����readResolveָ���Ķ���
	 * @return ����ָ���Ķ���
	 * 
	 */
	public Object readResolve(){
		return instance;
	}
	
	
	
}
