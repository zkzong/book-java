package com.zkzong.ch3.threadlocal;

/**
 * Created by Zong on 2017/2/26.
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "我是默认值 第一次get不再为null";
    }
}
