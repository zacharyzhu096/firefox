package com.jxust.sme.linkedlisttest01;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Zachary Zhu on 2018/9/18 15:56
 */
public class ListDemo {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList=new MyLinkedList<String>();
        myLinkedList.add("a01");
        myLinkedList.add("a02");
        myLinkedList.add("a03");
        myLinkedList.add("a04");

        myLinkedList.reverse();
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));

    }
}
