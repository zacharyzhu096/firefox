package com.jxust.sme.optionaltest;

import java.util.Optional;

/**
 * Created by Zachary Zhu on 2018/9/13 9:35
 */
public class OptionalTest {
    public static void main(String []args){
        User user=new User("wang","aa123");
        Optional<User> optional=Optional.ofNullable(user);


    }


}
