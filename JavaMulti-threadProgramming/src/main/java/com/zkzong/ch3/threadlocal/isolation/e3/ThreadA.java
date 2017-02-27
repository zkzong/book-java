package com.zkzong.ch3.threadlocal.isolation.e3;

import com.zkzong.ch3.threadlocal.isolation.e3.tools.Tools;

/**
 * Created by Zong on 2017/2/26.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("在ThreadA线程中取值=" + Tools.t1.get());
                Thread.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
