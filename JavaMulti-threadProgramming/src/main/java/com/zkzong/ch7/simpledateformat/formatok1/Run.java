package com.zkzong.ch7.simpledateformat.formatok1;

import java.text.SimpleDateFormat;

public class Run {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStringArray = new String[] {"2017-08-01", "2017-08-01", "2017-08-02", "2017-08-03",
                "2017-08-04", "2017-08-05", "2017-08-06", "2017-08-07", "2017-08-08"};
        MyThread[] threadArray = new MyThread[8];
        for (int i = 0; i < threadArray.length; i++) {
            threadArray[i] = new MyThread(sdf, dateStringArray[i]);
        }
        for (int i = 0; i < 8; i++) {
            threadArray[i].start();
        }

    }
}
