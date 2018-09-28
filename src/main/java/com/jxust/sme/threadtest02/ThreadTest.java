package com.jxust.sme.threadtest02;

/**
 * Created by Zachary Zhu on 2018/9/13 16:54
 */
public class ThreadTest {

    public static void main(String []args){
        StuThread stuThread=new StuThread();
        TeaThread teaThread=new TeaThread();
        stuThread.setName("线程A");
        teaThread.setName("线程B");
        stuThread.setPriority(5);
        teaThread.setPriority(8);


        teaThread.start();
        stuThread.start();





    }



}
