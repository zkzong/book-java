package com.zkzong.ch1.thread.www;

/**
 * Created by Zong on 2016/11/4.
 * 线程的调用的随机性：先打印"运行结束！"，后输出“MyThread”
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        // 如果多次调用start()方法，则会出现异常Exception in thread "main" java.lang.IllegalThreadStateException
//        myThread.start();
//        myThread.start();
        System.out.println("运行结束！");
    }
}
