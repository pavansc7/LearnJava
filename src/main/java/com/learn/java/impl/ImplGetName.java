package com.learn.java.impl;

import com.learn.java.interfaces.GetName;

public class ImplGetName implements GetName {

    @Override
    public String getName(String name) {
        System.out.println(name);
        return "abc";
    }
    //("name") -> System.out.println("name");
}
