package com.zkzong.ch1.thread.currentThread;

/**
 * Created by Zong on 2017/2/7.
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印：" + Thread.currentThread().getName());
    }
}
