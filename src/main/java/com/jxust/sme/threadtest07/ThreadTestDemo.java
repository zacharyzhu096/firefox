package com.jxust.sme.threadtest07;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Zachary Zhu on 2018/9/18 8:56
 */
public class ThreadTestDemo {
    public static void main(String[] args) {
        Lock lock=new ReentrantLock();
        Condition condition=lock.newCondition();
        Thread t1=new Thread(new A(lock,condition));
        Thread t2=new Thread(new B(lock,condition));
        //Thread t3=new Thread(new C(lock));
        t1.setName("线程1");
        t2.setName("线程2");
        //t3.setName("线程3");
        t1.start();
        t2.start();
        //t3.start();

    }
}
