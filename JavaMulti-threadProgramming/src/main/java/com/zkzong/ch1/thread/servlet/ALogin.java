package com.zkzong.ch1.thread.servlet;

/**
 * Created by Zong on 2017/2/4.
 */
public class ALogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("a", "aa");
    }
}
