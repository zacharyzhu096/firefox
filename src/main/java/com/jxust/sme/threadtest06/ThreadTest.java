package com.jxust.sme.threadtest06;

/**
 * Created by Zachary Zhu on 2018/9/17 21:15
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread t1=new Thread(new A());
        Thread t2=new Thread(new B());
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();


    }
}
