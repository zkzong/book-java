package com.zkzong.ch3.wait_notify;

/**
 * Created by Zong on 2017/6/14.
 */
public class Product {
    private String lock;

    public Product(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        synchronized (lock) {
            if (!ValueObject.value.equals("")) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String value = System.currentTimeMillis() + "_" + System.nanoTime();
            System.out.println("生产者set的值是：" + value);
            ValueObject.value = value;
            lock.notify();
        }
    }
}
