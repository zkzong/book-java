package com.zkzong.ch1.thread.sharenot;

/**
 * Created by Zong on 2017/2/3.
 */
public class Run {
    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}
