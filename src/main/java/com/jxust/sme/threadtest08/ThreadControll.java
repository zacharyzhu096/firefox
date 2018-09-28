package com.jxust.sme.threadtest08;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Zachary Zhu on 2018/9/18 11:39
 */
public class ThreadControll {
    public static void main(String[] args) {
        ReadWriteLock readWriteLock=new ReentrantReadWriteLock();
        //Condition condition=new ReentrantLock().newCondition();
        Condition condition=readWriteLock.writeLock().newCondition();
        Thread t11=new Thread(new A(readWriteLock));
        Thread t12=new Thread(new A(readWriteLock));
        Thread t2=new Thread(new B(readWriteLock,condition));
        Thread t3=new Thread(new C(readWriteLock,condition));
        t11.setName("线程t11");
        t12.setName("线程t12");
        t2.setName("线程t2");
        t3.setName("线程t3");
        t11.start();
        t12.start();
        t2.start();
        t3.start();
    }
}
