package com.jxust.sme.threadtest03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.dc.pr.PRError;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Zachary Zhu on 2018/9/26 16:06
 */
public class ThreadPoolDemo {
    private static Logger logger=LoggerFactory.getLogger(ThreadPoolDemo.class);
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool= Executors.newScheduledThreadPool(3);
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                //System.out.println("延迟1秒后每三秒执行一次");
                logger.info("延迟1秒后每三秒执行一次");
            }
        },1,3,TimeUnit.SECONDS);

    }

}
