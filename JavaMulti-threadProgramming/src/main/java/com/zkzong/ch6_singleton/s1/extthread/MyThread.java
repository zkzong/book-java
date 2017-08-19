package com.zkzong.ch6_singleton.s1.extthread;

import com.zkzong.ch6_singleton.s1.test.MyObject;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}

}
