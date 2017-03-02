package com.zkzong.ch1.thread.stop.stopmethod;

/**
 * Created by zong on 2017/2/28.
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
