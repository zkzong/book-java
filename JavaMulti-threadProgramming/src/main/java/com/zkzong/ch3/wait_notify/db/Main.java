package com.zkzong.ch3.wait_notify.db;

/**
 * Created by Zong on 2017/6/14.
 */
public class Main {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            ThreadB tb = new ThreadB(dbTools);
            tb.start();
            ThreadA ta = new ThreadA(dbTools);
            ta.start();
        }
    }
}
