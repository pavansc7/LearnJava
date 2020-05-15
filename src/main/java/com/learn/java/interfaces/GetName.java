package com.learn.java.interfaces;

public interface GetName{
    String getName(String name);
    default void doNothing(){

    }
}
