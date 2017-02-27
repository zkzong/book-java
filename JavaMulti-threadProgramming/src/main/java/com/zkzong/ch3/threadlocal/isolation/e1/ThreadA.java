package com.zkzong.ch3.threadlocal.isolation.e1;

import com.zkzong.ch3.threadlocal.isolation.e1.tools.Tools;

/**
 * Created by Zong on 2017/2/26.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
//                if (Tools.t1.get() == null) {
                    Tools.t1.set("ThreadA" + (i + 1));
//                } else {
                    System.out.println("ThreadA get Value=" + Tools.t1.get());
//                }
                Thread.sleep(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
