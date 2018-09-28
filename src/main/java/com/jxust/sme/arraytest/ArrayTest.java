package com.jxust.sme.arraytest;

import com.jxust.sme.linkedlisttest01.MyLinkedList;

import java.util.*;

/**
 * Created by Zachary Zhu on 2018/9/14 11:05
 */
public class ArrayTest {
    public static void main(String[] args) {
//        String []a=null;
//        String []b=a;
//        a=new String[]{"li","wang"};
//        System.out.println(b);
//
//
//        int h;
//        int p=(h=289000000)^(h>>>16);
        //h=280;
        //int p=h>>>16;

        //int cv=280 ^ 0;




        int hash=43;
        int index1=hash & 15;
        int index2=hash & 31;
        int index3=hash & 63;
        int index4=hash & 127;
        int index5=hash & 255;
        int index6=hash & 511;
        int index7=hash & 1023;
        int index8=hash & 2047;




        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);
        System.out.println(index5);
        System.out.println(index6);
        System.out.println(index7);
        System.out.println(index8);

        int x=100;
        if (x>180){
            System.out.println("x大于80");
        }else if (x<20){
            System.out.println("x小于120");
        }else {
            System.out.println("其它的");
        }

        int xt=12;
        int xp1=xt & 15;
        int xp2=xt & 31;
        System.out.println("验证");
        System.out.println(xp1);
        System.out.println(xp2);

        int page=xt & 16;
        System.out.println("新的值");
        System.out.println(page);

        System.out.println("+++++++++++");
        String a="aa";
        String b="ac";
        System.out.println(a.compareTo(b));

        System.out.println();
        System.out.println();

        TreeMap<String,String> treeMap=new TreeMap<String,String>();

        treeMap.put("ac","3");
        treeMap.put("ad","4");
        treeMap.put("aa","1");
        treeMap.put("ab","2");

//        for (Map.Entry<String,String> entrySet:treeMap.entrySet()){
//
//        }

//        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
//
//        }

        for (Map.Entry<String,String> entry:treeMap.entrySet()){
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }

        int tableSizeFor=MyHashMap.tableSizeFor(50);
        System.out.println("打印tableSizeFor的值为："+tableSizeFor);


    }
}
