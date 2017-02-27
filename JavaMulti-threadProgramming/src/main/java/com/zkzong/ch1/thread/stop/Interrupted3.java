package com.zkzong.ch1.thread.stop;

/**
 * Created by Zong on 2017/2/10.
 */
public class Interrupted3 {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1？=" + thread.isInterrupted()); // true
            System.out.println("是否停止2？=" + thread.isInterrupted()); // true
        } catch (Exception e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
