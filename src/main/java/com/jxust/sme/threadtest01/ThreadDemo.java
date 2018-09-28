package com.jxust.sme.threadtest01;

/**
 * Created by Zachary Zhu on 2018/9/13 11:26
 */
public class ThreadDemo {

    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i = 30; i > 0; i--) {
                        synchronized ("mark"){
                            System.out.println("正在运行线程：："+Thread.currentThread().getName()+"，此时的i为::"+i);
                            System.out.println("打印当前线程名称：" + Thread.currentThread().getName() + ",打印当前的i值为： " + i);
                            System.out.println("线程："+Thread.currentThread().getName()+"...i为"+i+"，本次执行完毕");

                            // 让线程睡眠一会
                            //Thread.sleep(50);
                        }

                    }
                }catch (Exception e) {
                    System.out.println("Thread " +  Thread.currentThread().getName() + " interrupted.");
                }
            }
        },"Thread-11");

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int i = 30; i > 0; i--) {
                        synchronized ("mark ding"){
                            System.out.println("正在运行线程：："+Thread.currentThread().getName()+"，此时的i为::"+i);
                            System.out.println("打印当前线程名称：" + Thread.currentThread().getName() + ",打印当前的i值为： " + i);
                            System.out.println("线程："+Thread.currentThread().getName()+"...i为"+i+"，本次执行完毕");
                            // 让线程睡眠一会
                            //Thread.sleep(50);
                        }

                    }
                }catch (Exception e) {
                    System.out.println("Thread " +  Thread.currentThread().getName() + " interrupted.");
                }
            }
        },"Thread-00");
        t1.start();
        t2.start();


    }
}
