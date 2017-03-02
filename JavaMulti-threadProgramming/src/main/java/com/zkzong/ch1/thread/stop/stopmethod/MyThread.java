package com.zkzong.ch1.thread.stop.stopmethod;

/**
 * Created by zong on 2017/2/28.
 */
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        super.run();
        try {
            while (true) {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
