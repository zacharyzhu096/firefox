package com.jxust.sme.threadtest02;

/**
 * Created by Zachary Zhu on 2018/9/13 16:47
 */
public class StuThread extends Thread {
    public void run(){
        for (int i=0;i<500;i++){
            System.out.println(Thread.currentThread().getName()+"准备让步"+i);

            Thread.yield();

        }

    }

}
