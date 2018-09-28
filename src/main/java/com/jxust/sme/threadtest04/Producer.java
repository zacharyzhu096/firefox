package com.jxust.sme.threadtest04;

/**
 * Created by Zachary Zhu on 2018/9/17 9:33
 */
public class Producer implements Runnable {
    private TaskBook tb;
    public Producer(TaskBook tb){
        this.tb=tb;
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            tb.produce('A');
        }
    }
}
