package com.daxin.callable;

/**
 * 
 * �ص��Ļ���ģ�ͣ�
 * 
 * @author �ഺ��פDax1n
 *
 *         �����ǹ۲���ģʽ����Ŀ����ά�������й۲��ߵ����ã����ص�����ֻ��ά����һ�����á�
 */
public class Button {
	private OnClickListener onClickListener;

	// ע��һ���¼�
	public void setOnclickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}

	// ��Ҫ���õ�ʱ��ص�
	public void call() {
		onClickListener.oncall();
	}

	public static void main(String[] args) {

	}
}

class ButtonTest {
	public static void main(String[] args) {
		Button a = new Button();
		a.setOnclickListener(new OnClickListener() {
			@Override
			public void oncall() {
				System.out.println("�ص�����������");
			}
		});
		a.call();
	}
}
