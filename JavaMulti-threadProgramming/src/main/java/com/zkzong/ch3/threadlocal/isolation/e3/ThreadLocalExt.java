package com.zkzong.ch3.threadlocal.isolation.e3;

import java.util.Date;

/**
 * Created by Zong on 2017/2/26.
 */
public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }
}
