package com.zkzong.ch4.ReentrantReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Zong on 2017/6/14.
 */
public class MyService {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read() {
        lock.readLock().lock();
        System.out.println(Thread.currentThread().getName() + " Read AAA " + System.currentTimeMillis());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.readLock().unlock();
    }

    public void write() {
        lock.writeLock().lock();
        System.out.println(Thread.currentThread().getName() + " Write BBB " + System.currentTimeMillis());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.writeLock().unlock();
    }
}
