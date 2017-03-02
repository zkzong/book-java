package com.zkzong.ch1.thread.sleep.stop;

/**
 * Created by zong on 2017/2/28.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止！進入catch！" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
