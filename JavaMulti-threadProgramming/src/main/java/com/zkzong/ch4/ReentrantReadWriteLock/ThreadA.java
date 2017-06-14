package com.zkzong.ch4.ReentrantReadWriteLock;

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
        service.read();
    }
}
