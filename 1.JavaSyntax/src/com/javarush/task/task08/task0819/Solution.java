package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/*
. Внутри класса Solution создать public static класс кот - Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
cats.remove(cats.iterator().next());
printCats(cats);


        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> res = new HashSet<>();
        for (int i =0;i<3;i++){
            res.add(new Cat());
        }
        //напишите тут ваш код. step 2 - пункт 2
        return res;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats){
            System.out.println(cat);

        }
        // step 4 - пункт 4
    }
public static class Cat {
    }
    // step 1 - пункт 1
}
