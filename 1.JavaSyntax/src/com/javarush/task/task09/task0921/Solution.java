package com.javarush.task.task09.task0921;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
1. Вспоминаем, как пишется БуфферРидер ; )
2. Вспоминаем про списочный массив, создаём его.
3. Пробуем в цикле пока (истина)  парсить и записывать в списочный массив числа с клавиатуры, можно даже не ломать его break'ом, потому что исключение и так вытащит нас из вечного сна цикла.
4. Перехватываем исключения типа ввода-вывода или числового формата.
5. В блоке finally, который в любом случае отработает после всех попыток и перехватов, распечатываем foreach'ем наш списочный массив.
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {

        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
try {


    while (true) {
       String string = reader.readLine();
        int text = Integer.parseInt(string);
        list.add(text);
    }
}
        catch (Exception e ){
    for (Integer value : list){
        System.out.println(value);

    }

        }

        //напишите тут ваш код
    }
}
