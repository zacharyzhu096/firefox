package com.jxust.sme.threadtest06;

/**
 * Created by Zachary Zhu on 2018/9/17 21:14
 */
public class A implements Runnable{
    public void run(){
        for (int i=0;i<20;i++){
            synchronized ("x"){
                if (Thread.holdsLock("x")){
                    System.out.println(Thread.currentThread().getName()+"持有对象的锁");
                }
                if (Constant.count==8){
                    try {
                        System.out.println("达到最大容量，将阻塞");
                        "x".wait();
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                }
                //注意，此处必须是"x"，否则会报IllegalMonitorStateException异常
                //抛出该异常表明某一线程已经试图等待对象的监视器，或者试图通知其他正在等待对象的监视器，然而本身没有指定的监视器的线程。
                "x".notify();
                Constant.count++;
                System.out.println("正在执行"+Thread.currentThread().getName()+"count的计数值为"+Constant.count);
            }

        }

    }

}
