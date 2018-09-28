package com.jxust.sme.threadtest05;

/**
 * Created by Zachary Zhu on 2018/9/17 15:46
 */
public class ThreadTest {
    public static void main(String[] args) {
        Slave slave=new Slave();
        slave.count=0;
        Thread t1=new AThread(slave);
        Thread t2=new BThread(slave);
        t1.setName("线程A");
        t2.setName("线程B");
        t1.start();
        t2.start();


    }
}
