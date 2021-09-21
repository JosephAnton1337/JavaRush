package com.javarush.task.task15.task1524;

/*
static void init()
Static block
public static void main
Non-static block
static void printAllFields
0
null
Solution constructor
static void printAllFields
6
First name
Порядок загрузки переменных
*/

public class Solution {
    public static void init() {
        System.out.println("static void init()");
    }
    static {
        init();
    }


    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";

    static {
        init();
    }

    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }
    static {
        System.out.println("Static block");
    }



    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");

        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
