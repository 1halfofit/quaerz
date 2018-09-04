package com.bo.job;

import java.util.Date;

public class PrintJob {
    public void run() {
        System.out.println("这是一个作业:" + new Date().toLocaleString());
    }
}
