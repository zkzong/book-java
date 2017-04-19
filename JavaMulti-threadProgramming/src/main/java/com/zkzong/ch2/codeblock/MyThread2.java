package com.zkzong.ch2.codeblock;

/**
 * Created by Zong on 2017/4/18.
 */
public class MyThread2 extends Thread {
    private Task task;

    public MyThread2(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.otherMethod();
    }
}
