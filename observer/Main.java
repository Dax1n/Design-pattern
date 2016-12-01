package com.daxin.observer;

public class Main {
	public static void main(String[] args) {
		final Subject sj=new Subject();
		zhangsan zs=new zhangsan();
		lisi ls=new lisi();
		
		sj.register(zs);
		sj.register(ls);
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//村长贪污出事了
				sj.inform();
				
			}
		}).start();
		
	}

}
