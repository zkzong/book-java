package com.zkzong.ch6_singleton.s2_3.test.run;

import com.zkzong.ch6_singleton.s2_3.extthread.MyThread;

public class Run {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		t1.start();
		t2.start();
		t3.start();

		// 此版本代码虽然是正确的
		// 但public static MyObject getInstance()方法
		// 中的全部代码都是同步的了，这样做有损效率
	}

}
