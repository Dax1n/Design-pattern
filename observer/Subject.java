package com.daxin.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 小故事：党中央分配百姓监督村长（被观察对象 Subject）贪污问题，被党中央指定的平民百姓（观察者 Observer）会形成一个组织，这个组织就是一群平民百姓
 * 
 * 此类中对应的就是成员List<Observer> lists = new ArrayList<Observer>();
 * @author 青春常驻Dax1n
 *
 *	Subject 是被观察的对象，村长
 *
 */
public class Subject {

	//监督村长的组织
	List<Observer> lists = new ArrayList<Observer>();
	
 	/**
 	 * 党中央指定该百姓加入监督村长组织
 	 * @param observer
 	 */
	public void register(Observer observer){
		lists.add(observer);
	}

	/**
	 * 类似于村长出廉政问题了，被传开，传到老百姓耳朵里面（通知观察者）
	 */
	public void inform(){
		for (Observer observer : lists) {
			observer.update();
		}
	}
	/**
	 * 被党中央取消监督村长的职责
	 * @param observer
	 */
	public void unInform(Observer observer){
		lists.remove(observer);
	}
}
