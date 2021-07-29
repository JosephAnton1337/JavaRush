package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/*
1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();
    
    //напишите тут ваш код

    public Cat() {
        
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            cats.add(new Cat());
        }
        //напишите тут ваш код
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
        //напишите тут ваш код
    

}
