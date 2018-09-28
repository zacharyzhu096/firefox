package com.jxust.sme.threadtest05;

/**
 * Created by Zachary Zhu on 2018/9/17 15:46
 */
public class AThread extends Thread{
    private Slave slave;
    public AThread(Slave slave){
        this.slave=slave;
    }
    public void run(){
        try{
            Thread.sleep(10);
        }catch (Exception e){
            e.printStackTrace();
        }

        this.slave.count=1;
        System.out.println(Thread.currentThread().getName());
    }
}
