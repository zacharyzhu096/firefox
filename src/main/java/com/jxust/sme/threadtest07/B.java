package com.jxust.sme.threadtest07;

import com.jxust.sme.threadtest06.Constant;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Zachary Zhu on 2018/9/18 8:55
 */
public class B implements Runnable {
    private Lock lock;
    private Condition condition;
    public B(Lock lock,Condition condition){
        this.lock=lock;
        this.condition=condition;
    }

    public void run(){

        for (int i=0;i<100;i++){
            try{
               lock.lock();
                if (Constant.count==0){
                    try {
                        System.out.println("达到最小容量，将阻塞");
                        //"x".wait();
                        condition.await();
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                }
                //"x".notify();
                condition.signal();
                Constant.count--;
                System.out.println("BB");
                System.out.println("正在执行"+Thread.currentThread().getName()+"，count的计数值为"+Constant.count);
            }
            finally {
                lock.unlock();
            }
        }
    }
}
