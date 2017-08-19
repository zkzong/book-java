package com.zkzong.ch6_singleton.s3.test;

public class MyObject {

	// �ڲ��෽ʽ
	private static class MyObjectHandler {
		private static MyObject myObject = new MyObject();
	}

	private MyObject() {
	}

	public static MyObject getInstance() {
		return MyObjectHandler.myObject;
	}

}
