package com.jxust.sme.threadtest07;

import com.jxust.sme.threadtest06.Constant;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Zachary Zhu on 2018/9/17 21:57
 */
public class A implements Runnable{
    private Lock lock;
    private Condition condition;
    public A(Lock lock,Condition condition){
        this.lock=lock;
        this.condition=condition;
    }
    public void run(){
        for (int i=0;i<100;i++){
            try{
                lock.lock();
                System.out.println(Thread.currentThread().getName()+" "+Thread.holdsLock(lock));
                if (Constant.count==8){
                    try {
                        System.out.println("达到最大容量，将阻塞");
                        //"x".wait();
                        condition.await();
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                }
                //注意，此处必须是"x"，否则会报IllegalMonitorStateException异常
                //抛出该异常表明某一线程已经试图等待对象的监视器，或者试图通知其他正在等待对象的监视器，然而本身没有指定的监视器的线程。
                //"x".notify();
                condition.signal();
                Constant.count++;
                System.out.println("AA");
                System.out.println("正在执行"+Thread.currentThread().getName()+"，count的计数值为"+Constant.count);
            }
            finally {
                lock.unlock();
            }
        }

    }
}
