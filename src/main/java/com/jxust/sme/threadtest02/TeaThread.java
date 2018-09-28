package com.jxust.sme.threadtest02;

/**
 * Created by Zachary Zhu on 2018/9/13 16:47
 */
public class TeaThread extends Thread {
    public void run(){

        for (int i=0;i<500;i++){
            System.out.println(Thread.currentThread().getName()+"在执行"+i);
        }

    }

}
