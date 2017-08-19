package com.zkzong.ch4_lock.condition.alter_print;

/**
 * Created by Zong on 2017/6/14.
 */
public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            service.getValue();
        }
    }
}
