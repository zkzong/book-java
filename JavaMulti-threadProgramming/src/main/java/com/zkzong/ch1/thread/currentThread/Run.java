package com.zkzong.ch1.thread.currentThread;

/**
 * Created by Zong on 2017/2/7.
 */
public class Run {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        t1.setName("A");
        t1.start();

//        CountOperate---begin
//        Thread.currentThread().getName()=main
//        this.getName()=Thread-0
//        CountOperate---end
//        run---begin
//        Thread.currentThread().getName()=A
//        this.getName()=Thread-0
//        run---end
    }
}
