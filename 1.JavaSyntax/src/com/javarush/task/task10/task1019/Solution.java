package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.
// map.forEach((key, value) -> System.out.println(value + " " + key));Валидатор не принимает решение


Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Integer> map = new HashMap();
        while (true) {
            String id = reader.readLine();
            if (id.equals("")){
                break;
            }
            String name = reader.readLine();
            //if (name.equals("")) break;

            map.put(name,Integer.parseInt(id));

        }
        for (Map.Entry<String,Integer> pair : map.entrySet())
        {
            System.out.println(pair.getValue()+" "+pair.getKey());
        }
       // map.forEach((key, value) -> System.out.println(value + " " + key));Валидатор не принимает решение


    }
}
