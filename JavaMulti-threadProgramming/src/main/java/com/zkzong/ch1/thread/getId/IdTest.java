package com.zkzong.ch1.thread.getId;

/**
 * Created by Zong on 2017/2/7.
 */
public class IdTest {
    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId());
        // main 1
    }
}
