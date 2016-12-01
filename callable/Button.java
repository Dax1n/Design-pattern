package com.daxin.callable;

/**
 * 
 * 回调的基本模型：
 * 
 * @author 青春常驻Dax1n
 *
 *         区别是观察者模式里面目标类维护了所有观察者的引用，而回调里面只是维护了一个引用。
 */
public class Button {
	private OnClickListener onClickListener;

	// 注册一个事件
	public void setOnclickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}

	// 需要调用的时候回调
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
				System.out.println("回调函数被调用");
			}
		});
		a.call();
	}
}
