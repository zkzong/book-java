package com.zkzong.ch1.thread.stop;

/**
 * Created by Zong on 2017/2/10.
 */
public class Interrupted2 {
    public static void main(String[] args) {

        Thread.currentThread().interrupt();
        System.out.println("是否停止1？=" + Thread.interrupted()); // true
        System.out.println("是否停止2？=" + Thread.interrupted()); // false
        System.out.println("end!");

//        测试当前线程是否已经中断。线程的中断状态由该方法清除。
//        换句话说，如果连续两次调用该方法，则第二次调用将返回false。
//        （在第一次调用已清除了其中断状态之后，且第二次调用检验完中断状态前，当前线程再次中断的情况除外）

    }
}
