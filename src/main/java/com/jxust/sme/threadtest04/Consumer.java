package com.jxust.sme.threadtest04;

/**
 * Created by Zachary Zhu on 2018/9/17 9:34
 */
public class Consumer implements Runnable {
    private TaskBook tb;
    public Consumer(TaskBook tb){
        this.tb=tb;
    }

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            tb.consume();
        }
    }
}
