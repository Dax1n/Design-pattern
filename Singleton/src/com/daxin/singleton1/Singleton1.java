package com.daxin.singleton1;

/**
 * 
 * @author �ഺ��פDax1n
 * @version 1.0
 *<br>
 * ����ʽ����ν����ʽ���ǲ����費�趼�ȴ�������˵�����ַ�ʽ���������ӳټ��ء�<br>
 * ���ַ�ʽ��򵥣�Ч��Ҳ��ߡ������漰ͬ����������⣩<br>
 * JDKԴ����Runtime��currentRuntime���ǵ��������Ƕ���ʽʵ��<br>
 * ���飺<br>
 * ������Ŀѽһ�㲻����д���������򵥡�����������࣡
 */
public class Singleton1 {
	
	//˽�о�̬��Ա��������Singleton1�ֽ������ʱ�򱻳�ʼ��
	private static Singleton1 instance =new Singleton1();
	
	//���췽��˽�л�
	private Singleton1() {
	
	}
	

	//��ȡ�õ�����ʵ������
	public static Singleton1 getInstance(){
		
		return instance;
	}

	public static void main(String[] args) {
		
		
		 
		
	}
	
}
