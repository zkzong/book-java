package com.zkzong.ch7.simpledateformat.formatok1;

import com.zkzong.ch7.simpledateformat.formatok1.tools.DateTools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {
    private SimpleDateFormat sdf;
    private String dateString;

    public MyThread(SimpleDateFormat sdf, String dateString) {
        this.sdf = sdf;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            // 创建多个SimpleDateFormat类的实例
            Date dateRef = DateTools.parse("yyyy-MM-dd", dateString);
            String newDateString = DateTools.format("yyyy-MM-dd", dateRef).toString();
            if (!newDateString.equals(dateString)) {
                System.out.println("ThreadName=" + this.getName()
                + "报错了 日期字符串：" +dateString + " 转换成的日期为："
                + newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
