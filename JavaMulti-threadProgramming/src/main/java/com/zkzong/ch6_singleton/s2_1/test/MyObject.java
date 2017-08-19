package com.zkzong.ch6_singleton.s2_1.test;

public class MyObject {

	private static MyObject myObject;

	private MyObject() {
	}

	public static MyObject getInstance() {
		try {
			if (myObject != null) {
			} else {
				// ģ���ڴ�������֮ǰ��һЩ׼���ԵĹ���
//				Thread.sleep(3000);
				myObject = new MyObject();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return myObject;
	}

}
