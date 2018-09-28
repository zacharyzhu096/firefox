package com.jxust.sme.threadtest01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Zachary Zhu on 2018/9/13 14:36
 */
public class MyThread extends Thread{
    private static final Logger logger=LoggerFactory.getLogger(MyThread.class);
    private String value1;
    private String value2;

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public void run(){
        this.value1="mei";
        this.value2="hu";
        try {
            Thread.sleep(200);
        }catch (InterruptedException e){
            //e.printStackTrace();
            System.out.println(Thread.currentThread().getName()+" 休眠的过程出现了异常");
        }
        for (int i=0;i<5;i++){
            logger.info(Thread.currentThread().getName()+"在运行，"+i);
        }

    }

    public static void main(String[] args) throws InterruptedException{
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        t1.setName("线程1");
        t2.setName("线程2");




        t1.start();
        t2.start();
        //Thread.sleep(20);
//        System.out.println(t1.getValue1());
//        System.out.println(t1.getValue2());

        //join() method suspends the execution of the calling thread until the object called finishes its execution.
//        t1.join();
//        t2.join();

        System.out.println("你好");
        t1.interrupt();
//        logger.info(t1.getValue1());
//        logger.info(t1.getValue2());
//        logger.info("我是一道分隔符");
//        logger.info(t2.getValue1());
//        logger.info(t2.getValue2());

    }


}
