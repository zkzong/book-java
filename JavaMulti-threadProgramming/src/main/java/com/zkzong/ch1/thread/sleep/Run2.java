package com.zkzong.ch1.thread.sleep;

/**
 * Created by Zong on 2017/2/7.
 */
public class Run2 {
    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();
        System.out.println("begin = " + System.currentTimeMillis());
        myThread.start();
        System.out.println("end = " + System.currentTimeMillis());

//        begin = 1486478273840
//        end = 1486478273840
//        run threadName=Thread-0 begin = 1486478273841
//        run threadName=Thread-0 end = 1486478275841
    }
}
