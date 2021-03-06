package com.jxust.sme.threadtest08;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Zachary Zhu on 2018/9/18 11:00
 */
public class B implements Runnable {
    private ReadWriteLock readWriteLock;
    private Condition condition;
    public B(ReadWriteLock readWriteLock,Condition condition){
        this.readWriteLock=readWriteLock;
        this.condition=condition;
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            try{
                readWriteLock.writeLock().lock();
                if (Value.value1==8){
                    try {
                        System.out.println("达到最大容量，将阻塞");
                        condition.await();
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                }
                condition.signal();
                Value.value1++;
                Value.value2++;
                System.out.println("B");
                System.out.println("正在执行"+Thread.currentThread().getName()+
                        "，计数值为value1:"+Value.value1+"，value2:"+Value.value2);
            }
            finally {
                readWriteLock.writeLock().unlock();
            }
        }
    }
}
