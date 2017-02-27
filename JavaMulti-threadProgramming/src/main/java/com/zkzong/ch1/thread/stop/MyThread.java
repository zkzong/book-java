package com.zkzong.ch1.thread.stop;

/**
 * Created by Zong on 2017/2/7.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
