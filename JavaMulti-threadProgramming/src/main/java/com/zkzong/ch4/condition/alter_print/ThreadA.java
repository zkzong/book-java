package com.zkzong.ch4.condition.alter_print;

/**
 * Created by Zong on 2017/6/14.
 */
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.setValue();
        }
    }
}
