package com.javarush.task.task16.task1624;

/*
1. Метод main должен вызывать метод start у нити t.
2. Метод main должен вызывать метод join у нити t.
3. Сначала программа должна вывести 10 строк начинающихся с "inside MyThread".
4. В конце программа должна вывести 10 строк начинающихся с "inside main".
5. Всего программа должна вывести 20 строк.
Последовательные выполнения нитей Ӏ Java Core: 6 уровень, 13 лекция
*/

public class Solution {
    public static MyThread t = new MyThread();
    static String message = "inside main ";

    public static void main(String a[]) throws Exception {
        t.start();
        t.join();
        Thread.sleep(1000);
        for (int i = 0; i < 10; i++) {
            System.out.println(message + i);
            sleep();
        }
    }

    public static void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    static class MyThread extends Thread {
        String message = "inside MyThread ";

        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(message + i);
                Solution.sleep();
            }
        }
    }
}