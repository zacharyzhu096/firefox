package com.jxust.sme.threadtest06;

/**
 * Created by Zachary Zhu on 2018/9/17 21:15
 */
public class B implements Runnable {
    public void run(){
        for (int i=0;i<20;i++){
            synchronized ("x"){
                if (Constant.count==0){
                    try {
                        System.out.println("达到最小容量，将阻塞");
                        "x".wait();
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                }

                "x".notify();
                Constant.count--;
                System.out.println("正在执行"+Thread.currentThread().getName()+"count的计数值为"+Constant.count);
            }

        }

    }
}
