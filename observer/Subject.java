package com.daxin.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * С���£������������ռල�峤�����۲���� Subject��̰�����⣬��������ָ����ƽ����գ��۲��� Observer�����γ�һ����֯�������֯����һȺƽ�����
 * 
 * �����ж�Ӧ�ľ��ǳ�ԱList<Observer> lists = new ArrayList<Observer>();
 * @author �ഺ��פDax1n
 *
 *	Subject �Ǳ��۲�Ķ��󣬴峤
 *
 */
public class Subject {

	//�ල�峤����֯
	List<Observer> lists = new ArrayList<Observer>();
	
 	/**
 	 * ������ָ���ð��ռ���ල�峤��֯
 	 * @param observer
 	 */
	public void register(Observer observer){
		lists.add(observer);
	}

	/**
	 * �����ڴ峤�����������ˣ��������������ϰ��ն������棨֪ͨ�۲��ߣ�
	 */
	public void inform(){
		for (Observer observer : lists) {
			observer.update();
		}
	}
	/**
	 * ��������ȡ���ල�峤��ְ��
	 * @param observer
	 */
	public void unInform(Observer observer){
		lists.remove(observer);
	}
}
