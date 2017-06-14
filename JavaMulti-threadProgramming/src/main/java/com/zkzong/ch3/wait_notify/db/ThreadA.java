package com.zkzong.ch3.wait_notify.db;

/**
 * Created by Zong on 2017/6/14.
 */
public class ThreadA extends Thread {
    private DBTools dbTools;

    public ThreadA(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backA();
    }
}
