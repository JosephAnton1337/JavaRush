package com.javarush.task.task14.task1421;

/*
Реализуй Singleton pattern:
Создай класс Singleton в отдельном файле.
Добавь в него статический метод getInstance().
При любом вызове метода getInstance() он должен возвращать один и тот же объект класса Singleton.
Подумай, каким образом можно запретить создание других объектов этого класса.
Сделай все конструкторы в классе Singleton приватными (private).
В итоге должна быть возможность создать объект (экземпляр класса) используя только метод getInstance.
Singleton
*/

public class Solution {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }
}
