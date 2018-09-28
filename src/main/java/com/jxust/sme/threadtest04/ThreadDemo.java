package com.jxust.sme.threadtest04;

/**
 * Created by Zachary Zhu on 2018/9/17 9:35
 */
public class ThreadDemo {
    public static void main(String[] args) {
        TaskBook taskBook=new TaskBook();
        Producer producer=new Producer(taskBook);
        Consumer consumer=new Consumer(taskBook);

        Thread t1=new Thread(producer);
        Thread t2=new Thread(consumer);
        t1.setName("生产者线程");
        t2.setName("消费者线程");
        t1.start();
        t2.start();
    }
}
