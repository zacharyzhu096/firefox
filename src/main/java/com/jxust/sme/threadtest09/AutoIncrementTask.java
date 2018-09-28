package com.jxust.sme.threadtest09;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Zachary Zhu on 2018/9/18 19:57
 */
public class AutoIncrementTask implements Runnable {
    private AtomicInteger atomicInteger;
    public AutoIncrementTask(AtomicInteger atomicInteger) {
        this.atomicInteger=atomicInteger;
    }

    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            atomicInteger.getAndIncrement();
        }

    }
}
