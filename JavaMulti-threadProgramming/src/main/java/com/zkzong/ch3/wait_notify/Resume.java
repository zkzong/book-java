package com.zkzong.ch3.wait_notify;

/**
 * Created by Zong on 2017/6/14.
 */
public class Resume {
    private String lock;

    public Resume(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        synchronized (lock) {
            if (!ValueObject.value.equals("")) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String value = System.currentTimeMillis() + "_" + System.nanoTime();
            System.out.println("消费者get的值是：" + ValueObject.value);
            ValueObject.value = "";
            lock.notify();
        }
    }
}
