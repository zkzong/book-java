package com.zkzong.ch6_singleton.s5.extthread;

import com.zkzong.ch6_singleton.s5.test.MyObject;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(MyObject.getInstance().hashCode());
		}
	}
}
