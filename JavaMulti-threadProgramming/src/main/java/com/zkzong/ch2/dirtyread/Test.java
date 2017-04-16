package com.zkzong.ch2.dirtyread;

/**
 * Created by zong on 17-4-16.
 */
public class Test {
    public static void main(String[] args) {
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA thread = new ThreadA(publicVar);
            thread.start();
            Thread.sleep(200); // 打印结果受此值大小影响
            publicVar.getValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
