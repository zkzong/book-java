package com.zkzong.ch3.wait_notify;

/**
 * Created by Zong on 2017/6/14.
 */
public class ProductThread extends Thread {
    private Product p;

    public ProductThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            p.setValue();
        }
    }
}
