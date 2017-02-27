package com.zkzong.ch1.thread.sleep;

/**
 * Created by Zong on 2017/2/7.
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();
        System.out.println("begin = " + System.currentTimeMillis());
        myThread.run();
        System.out.println("end = " + System.currentTimeMillis());

//        begin = 1486478053770
//        run threadName = main begin
//        run threadName = main end
//        end = 1486478055771
    }
}
