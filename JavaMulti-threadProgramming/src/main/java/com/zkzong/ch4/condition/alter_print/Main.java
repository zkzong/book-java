package com.zkzong.ch4.condition.alter_print;

/**
 * Created by Zong on 2017/6/14.
 */
public class Main {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA ta = new ThreadA(service);
        ThreadB tb = new ThreadB(service);
        ta.start();
        tb.start();
    }
}
