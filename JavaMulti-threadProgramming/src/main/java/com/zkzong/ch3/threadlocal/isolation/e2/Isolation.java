package com.zkzong.ch3.threadlocal.isolation.e2;

/**
 * Created by Zong on 2017/2/26.
 */
public class Isolation {
    public static void main(String[] args) {
        try {
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(1111);
            ThreadB b = new ThreadB();
            b.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
