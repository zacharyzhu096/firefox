package com.jxust.sme.threadtest04;

/**
 * Created by Zachary Zhu on 2018/9/17 9:33
 */
public class TaskBook {
    private char []value=new char[8];
    private int count=0;

    public synchronized void produce(char a){
        if (this.count==value.length){
            try{
                this.wait();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        this.notify();
        value[count]=a;
        System.out.println(Thread.currentThread().getName()+"正在生产第"+(count+1)+"个产品，该产品为"+a);
        count++;
    }

    public synchronized void consume(){

        if (this.count==0){
            try{
                this.wait();
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        this.notify();
        char x=value[count-1];
        System.out.println(Thread.currentThread().getName()+"正在消费第"+count+"个产品，该产品为"+x);
        count--;
    }
}
