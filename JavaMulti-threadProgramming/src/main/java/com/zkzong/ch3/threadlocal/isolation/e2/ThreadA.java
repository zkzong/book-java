package com.zkzong.ch3.threadlocal.isolation.e2;

import com.zkzong.ch3.threadlocal.isolation.e2.tools.Tools;

import java.util.Date;

/**
 * Created by Zong on 2017/2/26.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                if (Tools.t1.get() == null) {
                    Tools.t1.set(new Date());
                }
                System.out.println("A " + Tools.t1.get().getTime());
                Thread.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
