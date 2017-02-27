package com.zkzong.ch1.thread.currentThread;

/**
 * Created by Zong on 2017/2/7.
 */
public class Run2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread.start();
//        构造方法的打印：main
//        run方法的打印：Thread-0
        myThread.run();
//        构造方法的打印：main
//        run方法的打印：main
    }
}
