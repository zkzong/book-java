package com.zkzong.ch1.thread.isAlive;

/**
 * Created by Zong on 2017/2/7.
 */
public class RunCO {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive" + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main begin t1 isAlive" + t1.isAlive());

//        CountOperate---begin
//        Thread.currentThread().getName()=main
//        Thread.currentThread().isAlive()=true
//        this.getName()=Thread-0
//        this.isAlive()=false
//        CountOperate---end
//        main begin t1 isAlivefalse
//        main begin t1 isAlivetrue
//        run---begin
//        Thread.currentThread().getName()=A
//        Thread.currentThread().isAlive()=true
//        this.getName()=Thread-0
//        this.isAlive()=false
//        run---end
    }
}
