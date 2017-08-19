package com.zkzong.ch4_lock.condition.alter_print;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 实现生产者与消费者  一对一·交替打印
 * Created by Zong on 2017/6/14.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean flag = false;

    public void setValue() {
        lock.lock();
        while (flag == true) {
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("SetValue AAAA");
        flag = true;
        condition.signal();
        lock.unlock();
    }

    public void getValue() {
        lock.lock();
        while (flag == false) {
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("GetValue BBBB");
        flag = false;
        condition.signal();
        lock.unlock();
    }
}
