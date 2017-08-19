package com.zkzong.ch6_singleton.s2.test;

public class MyObject {

	private static MyObject myObject;

	private MyObject() {
	}

	public static MyObject getInstance() {
		// ясЁы╪сть
		if (myObject != null) {
		} else {
			myObject = new MyObject();
		}
		return myObject;
	}

}
