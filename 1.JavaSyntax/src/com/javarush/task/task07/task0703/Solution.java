package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.


*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str= new String[10];
        int[] number = new int[10];
        for (int i=0;i<10;i++){
            str[i] = reader.readLine();
            number[i] = str[i].length();
        }

        for (int i =0;i<10 ;i++){
            System.out.println(number[i]);

        }


        //напишите тут ваш код
    }
}
