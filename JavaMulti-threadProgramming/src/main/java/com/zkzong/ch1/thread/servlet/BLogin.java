package com.zkzong.ch1.thread.servlet;

/**
 * Created by Zong on 2017/2/4.
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
