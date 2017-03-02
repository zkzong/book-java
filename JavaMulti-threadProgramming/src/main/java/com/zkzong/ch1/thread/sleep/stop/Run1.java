package com.zkzong.ch1.thread.sleep.stop;

/**
 * Created by zong on 2017/2/28.
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
        thread.start();
        thread.interrupt();
        System.out.println("end!");
    }
}
