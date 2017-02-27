package com.zkzong.ch3.threadlocal.isolation.e1;

import com.zkzong.ch3.threadlocal.isolation.e1.tools.Tools;

/**
 * Created by Zong on 2017/2/26.
 */
public class Isolation {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();
            a.start();
            b.start();

            for (int i = 0; i < 100; i++) {
                Tools.t1.set("Main" + (i + 1));
                System.out.println("Main get Value=" + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
