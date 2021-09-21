package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
В этой задаче тебе нужно:
Создать в отдельных файлах классы Plane и Helicopter, реализующие интерфейс CanFly.
Класс Plane должен иметь конструктор с параметром int - количество перевозимых пассажиров.
В статическом методе reset() класса Solution:
считать с консоли параметр типа String;
если параметр равен "helicopter", статическому объекту CanFly result присвоить объект класса Helicopter;
если параметр равен "plane", считать второй параметр типа int (количество пассажиров), статическому объекту CanFly result присвоить объект класса Plane.
В статическом блоке инициализировать CanFly result, вызвав метод reset().
Закрыть поток ввода методом close().
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = reader.readLine();
        if ("plane".equals(key)){
            key=reader.readLine();

result= new Plain(Integer.parseInt(key));

        }
        if ("helicopter".equals(key)){
            result=new Helicopter();
        }
        reader.close();




        //add your code here - добавьте код тут
    }
}
