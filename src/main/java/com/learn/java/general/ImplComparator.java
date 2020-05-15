package com.learn.java.general;

import java.util.*;


public class ImplComparator {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6, 2, 1, 4, 9);
//        list.add(1);
//        list.add(4);
//        list.add(3);
//        list.add(2);
   list.sort((a,b)->{
       System.out.println(" " + a + " " + b + " " + (a<b?a:b));
       String fullClassName = Thread.currentThread().getStackTrace()[2].getClassName();
       String className = fullClassName.substring(fullClassName.lastIndexOf(".") + 1);
       String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
       int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();

       System.out.println(fullClassName+" "+className+" "+methodName+" "+" "+lineNumber);
       return a-b;
   });
      //  list.sort(Comparator.naturalOrder());
            System.out.println(list);
            //Collections.sort(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("pavam");
        list1.add("add");
        list1.add("dasdsadsa");
        System.out.println(list1);
        list1.sort(Comparator.comparingInt(String::length));

        System.out.println(list1);

    }



}
