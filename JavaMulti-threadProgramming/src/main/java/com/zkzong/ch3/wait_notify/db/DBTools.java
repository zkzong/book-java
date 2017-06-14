package com.zkzong.ch3.wait_notify.db;

/**
 * 创建20个线程，其中10个线程是将数据备份到数据库A，另外10个线程将数据备份到数据库B中去，并且
 * 备份数据库A和备份数据库B是交叉进行的
 * Created by Zong on 2017/6/14.
 */
public class DBTools {
    volatile private boolean prevIsA = false;

    //确保A备份先进行
    synchronized public void backA() {
        while (prevIsA == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("AAAAA");
        }
        prevIsA = true;
        notifyAll();
    }

    synchronized public void backB() {
        while (prevIsA == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("BBBBB");
        }
        prevIsA = false;
        notifyAll();
    }
}
