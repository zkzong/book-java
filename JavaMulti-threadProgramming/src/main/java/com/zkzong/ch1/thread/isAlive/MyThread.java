package com.zkzong.ch1.thread.isAlive;

/**
 * Created by Zong on 2017/2/7.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }
}
