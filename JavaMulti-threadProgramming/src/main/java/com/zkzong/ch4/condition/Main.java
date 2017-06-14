package com.zkzong.ch4.condition;

/**
 * Created by Administrator on 2017/6/14.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        ThreadA ta = new ThreadA(service);
        ta.start();
        Thread.sleep(5000);
        service.signal();
    }
}
