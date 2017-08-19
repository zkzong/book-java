package com.zkzong.ch4_lock.ReentrantReadWriteLock;

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
        service.write();
    }
}
