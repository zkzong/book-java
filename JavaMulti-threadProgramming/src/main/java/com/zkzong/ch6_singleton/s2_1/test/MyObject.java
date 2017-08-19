package com.zkzong.ch6_singleton.s2_1.test;

public class MyObject {

	private static MyObject myObject;

	private MyObject() {
	}

	public static MyObject getInstance() {
		try {
			if (myObject != null) {
			} else {
				// 模拟在创建对象之前做一些准备性的工作
//				Thread.sleep(3000);
				myObject = new MyObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return myObject;
	}

}
