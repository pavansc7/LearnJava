package com.learn.java.impl;

import com.learn.java.interfaces.GetName;

public class LearnLamba {
    GetName name;
    String val="abc";
   public LearnLamba(GetName name){
        this.name=name;
    }
    public GetName doNothing(){
        //System.out.println(name.getName("DoNothing"));
        return (val)->{ return val+"I am impl"; };
    }
public LearnLamba doNothing1(){
       return this;
}
  //  ImplGetName g = new ImplGetName();
}
