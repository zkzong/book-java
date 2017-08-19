package com.zkzong.ch4_lock.ReentrantReadWriteLock;

/**
 * Created by Zong on 2017/6/14.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA ta = new ThreadA(service);
        ta.setName("A");
        ta.start();
        Thread.sleep(1000);
        ThreadB tb = new ThreadB(service);
        tb.setName("B");
        tb.start();
    }
}
