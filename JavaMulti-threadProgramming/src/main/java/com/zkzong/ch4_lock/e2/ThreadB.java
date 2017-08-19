package com.zkzong.ch4_lock.e2;

/**
 * Created by zong on 17-4-16.
 */
public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
