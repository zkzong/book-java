package com.zkzong.ch6_singleton.s2.test.run;

import com.zkzong.ch6_singleton.s2.extthread.MyThread;

public class Run {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
	}

}
