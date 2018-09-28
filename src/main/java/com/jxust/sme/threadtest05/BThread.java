package com.jxust.sme.threadtest05;

/**
 * Created by Zachary Zhu on 2018/9/17 15:46
 */
public class BThread extends Thread{
    private Slave slave;
    public BThread(Slave slave){
        this.slave=slave;
    }
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println(this.slave.count);
        }

    }

}
