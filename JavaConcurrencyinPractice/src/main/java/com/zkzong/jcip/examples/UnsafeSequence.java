package com.zkzong.jcip.examples;

import com.zkzong.jcip.annotations.NotThreadSafe;

/**
 * Created by Zong on 2016/12/18.
 */
@NotThreadSafe
public class UnsafeSequence {
    private int value;

    // 返回一个唯一的数值
    public int getNext() {
        return value++;
    }
}
