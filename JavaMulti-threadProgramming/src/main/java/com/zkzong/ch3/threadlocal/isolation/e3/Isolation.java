package com.zkzong.ch3.threadlocal.isolation.e3;

import com.zkzong.ch3.threadlocal.isolation.e3.tools.Tools;

/**
 * Created by Zong on 2017/2/26.
 */
public class Isolation {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("    在Main线程中取值=" + Tools.t1.get());
                Thread.sleep(100);
            }

            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
