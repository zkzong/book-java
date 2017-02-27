package com.zkzong.ch1.thread.servlet;

/**
 * Created by Zong on 2017/2/4.
 */
public class Run {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
