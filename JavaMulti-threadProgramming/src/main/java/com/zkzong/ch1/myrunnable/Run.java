package com.zkzong.ch1.myrunnable;

/**
 * Created by Zong on 2016/11/4.
 */
public class Run {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
