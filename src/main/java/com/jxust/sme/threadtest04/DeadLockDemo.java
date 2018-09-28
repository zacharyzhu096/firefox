package com.jxust.sme.threadtest04;

/**
 * Created by Zachary Zhu on 2018/9/17 17:56
 */
public class DeadLockDemo {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始执行"+Thread.currentThread().getName());
                synchronized ("a"){
                    System.out.println("获取对象a的锁");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                    synchronized ("b"){
                        System.out.println("获取对象b的锁");
                        System.out.println("hello:"+Thread.currentThread().getName());
                    }
                }
                System.out.println(Thread.currentThread().getName()+"执行完毕");
            }
        },"线程1");

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始执行"+Thread.currentThread().getName());
                synchronized ("b"){
                    System.out.println("获取对象b的锁");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                    synchronized ("a"){
                        System.out.println("获取对象a的锁");
                        System.out.println("hello:"+Thread.currentThread().getName());
                    }
                }
                System.out.println(Thread.currentThread().getName()+"执行完毕");
            }
        },"线程2");
        t1.start();
        t2.start();
    }
}
