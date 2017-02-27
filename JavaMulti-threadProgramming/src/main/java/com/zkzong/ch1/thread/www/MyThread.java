package com.zkzong.ch1.thread.www;

/**
 * Created by Zong on 2016/11/4.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
