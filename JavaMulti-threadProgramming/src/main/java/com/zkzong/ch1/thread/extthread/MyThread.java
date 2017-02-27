package com.zkzong.ch1.thread.extthread;

/**
 * Created by Zong on 2016/11/4.
 */
public class MyThread extends Thread {
    private int i;

    public MyThread(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
