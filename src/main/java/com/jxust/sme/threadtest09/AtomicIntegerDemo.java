package com.jxust.sme.threadtest09;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Zachary Zhu on 2018/9/18 19:55
 */
public class AtomicIntegerDemo {
    public static void main(String[] args) throws Exception{
        AtomicInteger atomicInteger=new AtomicInteger();
        Thread t1=new Thread(new AutoIncrementTask(atomicInteger));
        Thread t2=new Thread(new AutoIncrementTask(atomicInteger));
        t1.start();
        t2.start();

        Thread.sleep(2000);
        System.out.println(atomicInteger.get());
    }
}
