package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels= new HashMap<Double, String>();

    static {
        labels.put(1.0,"First");
        labels.put(7.0,"second");
        labels.put(8.0,"Four");
        labels.put(9.0,"null");
        labels.put(321.0,"A");
    }



    public static  void main(String[] args) {


        System.out.println(labels);
    }
}
