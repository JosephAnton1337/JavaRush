package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/*
Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.

Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayOfArrayLists = new ArrayList[2];
        arrayOfArrayLists[0] = new ArrayList<String>();
        arrayOfArrayLists[0].add("123");
        arrayOfArrayLists[1] = new ArrayList<String>();
        arrayOfArrayLists[1].add("456");
        return arrayOfArrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}