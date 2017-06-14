package com.zkzong.ch3.wait_notify;

/**
 * Created by Zong on 2017/6/14.
 */
public class ResumeThread extends Thread {
    private Resume r;

    public ResumeThread(Resume r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.getValue();
        }
    }
}
