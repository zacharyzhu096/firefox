package com.jxust.sme.threadtest03;

import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

/**
 * Created by Zachary Zhu on 2018/9/13 19:34
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<String>(10);
        arrayList.add("lap1");
        arrayList.add("lap2");
        arrayList.add("lap3");
        arrayList.add(3,"lap4");
        arrayList.add("lap5");

        //System.out.println(arrayList.size());
        //Serializable
        //FileOutputStream
        //Vector
        //HashMap
        //LinkedList


    }
}
