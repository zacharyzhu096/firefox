package com.jxust.sme.threadtest08;
import java.util.concurrent.locks.*;

/**
 * Created by Zachary Zhu on 2018/9/18 10:38
 */
public class A implements Runnable {
    private ReadWriteLock readWriteLock;

    public A(ReadWriteLock readWriteLock){
        this.readWriteLock=readWriteLock;
    }

    public void run(){
        for (int i=0;i<100;i++){
            try {
                this.readWriteLock.readLock().lock();
                System.out.println("正在执行"+Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName()+"读取value1的值为："+Value.value1);
                System.out.println(Thread.currentThread().getName()+"读取value2的值为："+Value.value2);
            }
            finally {
                this.readWriteLock.readLock().unlock();
            }
        }
    }
}
