package com.zkzong.ch3.threadlocal.isolation.e2.tools;

import java.util.Date;

/**
 * Created by Zong on 2017/2/26.
 */
public class Tools {
    public static ThreadLocal<Date> t1 = new ThreadLocal<Date>();
}
