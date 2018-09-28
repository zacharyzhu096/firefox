package com.jxust.sme.arraytest;

/**
 * Created by Zachary Zhu on 2018/9/19 16:12
 */

public class MyHashMap {
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    public static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }


}
