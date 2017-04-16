package com.zkzong.ch1.thread.yield;

/**
 * Created by zong on 17-4-15.
 */
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.setPriority(1);
    }
}
