package com.javarush.task.task10.task1002;

/*
Правильно расставь операторы приведения типа, чтобы получился ответ: d=3.765.
int a = 15;
int b = 4;
float c = a / b;
double d = a * 1e-3 + c;
Задача №2 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = a /(float) b;
        double d = a * 1e-3 + c;

        System.out.println(d);
    }
}
