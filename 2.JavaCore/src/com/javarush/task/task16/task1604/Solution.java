package com.javarush.task.task16.task1604;

/*
1. Создать таск (public static класс SpecialThread, который реализует интерфейс Runnable).
2. SpecialThread должен выводить в консоль свой стек-трейс.

Подсказка: main thread уже выводит в консоль свой стек-трейс.
Вывод стек-трейса
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }

        }
    public static class SpecialThread implements Runnable{
        public void run () {
            for (StackTraceElement elements :Thread.currentThread().getStackTrace()){
                System.out.println(elements);
            }

        }

        }

    }

