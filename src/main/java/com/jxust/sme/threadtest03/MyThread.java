package com.jxust.sme.threadtest03;


import java.util.concurrent.*;

/**
 * Created by Zachary Zhu on 2018/9/13 17:39
 */
public class MyThread implements Callable<String> {
    private String value;

    public MyThread(String value)
    {
        this.value = value;
    }

    public String call() throws Exception
    {

        System.out.println("正在执行线程："+Thread.currentThread().getName());//pool-1-thread-1
        return "线程返回值是:"+this.value;
    }

    public static void main(String[] args)
    {
        //创建一个线程池对象
        ExecutorService pool = Executors.newCachedThreadPool();

        //创建一个有返回值的任务
        MyThread task = new MyThread("Java");

        //执行任务并获取Future对象
        Future<String> future  = pool.submit(task);


        //从 Future 对象 获取任务返回值
        while(true)
        {
            System.out.println("进入循环体");
            //可以用isDone()方法来查询Future是否已经完成，任务完成后，可以调用get()方法来获取结果
            //注意： 如果不加判断直接调用get方法，此时如果线程未完成，get将阻塞，直至结果准备就绪
            if(future.isDone())
            {
                try
                {

                    String returnValue = future.get().toString();

                    System.out.println("线程返回值:"+returnValue);


                }catch (Exception e){

                    e.printStackTrace();
                }

                //关闭线程池
                pool.shutdown();

                //跳出循环
                break;
            }else {
                System.out.println("任务未完成，请等待");
            }
        }



    }



}
