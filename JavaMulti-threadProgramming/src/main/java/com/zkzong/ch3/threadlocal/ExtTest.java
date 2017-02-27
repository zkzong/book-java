package com.zkzong.ch3.threadlocal;

/**
 * Created by Zong on 2017/2/26.
 */
public class ExtTest {
    public static ThreadLocalExt t1 = new ThreadLocalExt();

    public static void main(String[] args) {
        if (t1.get() == null) {
            System.out.println("从未放过值");
            t1.set("我的值");
        }

        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
