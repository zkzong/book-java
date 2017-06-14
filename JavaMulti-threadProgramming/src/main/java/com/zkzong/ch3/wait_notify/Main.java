package com.zkzong.ch3.wait_notify;

/**
 * Created by Zong on 2017/6/14.
 */
public class Main {
    public static void main(String[] args) {
        String str = new String("");
        Product p = new Product(str);
        Resume r = new Resume(str);
        ProductThread pt = new ProductThread(p);
        ResumeThread rt = new ResumeThread(r);
        pt.start();
        rt.start();

    }
}
