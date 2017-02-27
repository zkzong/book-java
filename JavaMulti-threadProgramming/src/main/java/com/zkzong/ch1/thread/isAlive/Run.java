package com.zkzong.ch1.thread.isAlive;

/**
 * Created by Zong on 2017/2/7.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("begin == " + myThread.isAlive());
        myThread.start();
//        System.out.println("end == " + myThread.isAlive());
//        begin == false
//        end == true
//        run=true

        Thread.sleep(1000);
        System.out.println("end == " + myThread.isAlive());
//        begin == false
//        run=true
//        end == false
    }
}
