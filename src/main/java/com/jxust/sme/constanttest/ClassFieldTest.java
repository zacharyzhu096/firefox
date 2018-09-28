package com.jxust.sme.constanttest;

import com.jxust.sme.optionaltest.User;

import java.util.Optional;
import java.util.concurrent.FutureTask;

/**
 * Created by Zachary Zhu on 2018/9/13 9:25
 */
public class ClassFieldTest {
    public static void main(String []args){
        A a=new A();
        System.out.println(a.getName());

        a.setName("mark ding");
        System.out.println(a.getName());


    }
}
