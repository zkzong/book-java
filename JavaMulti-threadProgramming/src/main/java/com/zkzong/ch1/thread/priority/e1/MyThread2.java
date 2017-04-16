package com.zkzong.ch1.thread.priority.e1;

/**
 * Created by zong on 17-4-15.
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority=" + this.getPriority());
    }
}
