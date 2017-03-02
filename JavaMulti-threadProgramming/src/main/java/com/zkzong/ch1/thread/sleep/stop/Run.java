package com.zkzong.ch1.thread.sleep.stop;

/**
 * Created by zong on 2017/2/28.
 * 如果在sleep状态下停止某一线程，会进入catch语句，并且清楚停止状态值，使之变成false。
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
