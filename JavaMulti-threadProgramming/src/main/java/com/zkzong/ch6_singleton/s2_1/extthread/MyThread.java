package com.zkzong.ch6_singleton.s2_1.extthread;

import com.zkzong.ch6_singleton.s2_1.test.MyObject;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}

}
