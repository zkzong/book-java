package com.zkzong.ch4_lock.e2;

/**
 * Created by zong on 17-4-16.
 */
public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.methodA();
    }
}
