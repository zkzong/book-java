package com.zkzong.ch4.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Zong on 2017/6/14.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await() {
        lock.lock();
        try {
            System.out.println("await A");
            condition.await(); // 使当前执行的线程处于等待状态 waiting
            System.out.println("await B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("释放锁");
        }
    }

    public void signal() {
        lock.lock();
        System.out.println("signal A");
        condition.signal();
        System.out.println("signal B");
        lock.unlock();
    }
}
