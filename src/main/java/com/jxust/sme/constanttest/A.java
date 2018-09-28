package com.jxust.sme.constanttest;

/**
 * Created by Zachary Zhu on 2018/9/13 9:38
 */
public class A {
    private String name="wang qiang";
    private final String rock=null;

    public A(){}
    public A(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRock() {
        return rock;
    }

    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.getName());

        a.setName("mark ding");
        System.out.println(a.getName());
    }


}
