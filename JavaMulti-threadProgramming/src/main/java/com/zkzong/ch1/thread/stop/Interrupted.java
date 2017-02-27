package com.zkzong.ch1.thread.stop;

/**
 * Created by Zong on 2017/2/10.
 */
public class Interrupted {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            // 调用interrupt()方法仅仅是在当前线程中打了一个停止的标记，并不是真的停止线程
//            Thread.currentThread().interrupt();
            System.out.println("是否停止1？=" + thread.interrupted()); // false
            System.out.println("是否停止2？=" + thread.interrupted()); // false
        } catch (Exception e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
