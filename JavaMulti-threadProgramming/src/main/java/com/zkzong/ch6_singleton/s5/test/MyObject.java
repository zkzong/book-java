package com.zkzong.ch6_singleton.s5.test;

public class MyObject {

	private static MyObject instance = null;

	private MyObject() {
	}

	static {
		instance = new MyObject();
	}

	public static MyObject getInstance() {
		return instance;
	}

}
