package com.zkzong.ch1.thread.test;

import org.junit.Test;

/**
 * Created by Zong on 2016/11/3.
 */
public class GetName {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        // 在控制台输出的main和main方法没有任何的关系，仅仅是名字相同而已
    }

    @Test
    public void test() {
        System.out.println(Thread.currentThread().getName());
    }
}
