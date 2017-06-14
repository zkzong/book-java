package com.zkzong.ch3.wait_notify.db;

/**
 * Created by Zong on 2017/6/14.
 */
public class ThreadB extends Thread {
    private DBTools dbTools;

    public ThreadB(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backB();
    }
}
