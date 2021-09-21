package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Найти пример паттерна Singleton с ленивой реализацией (lazy initialization).
По образу и подобию в отдельных файлах создать в отдельных файлах три класса синглтона — Sun, Moon, Earth.
Реализовать интерфейс Planet в классах Sun, Moon, Earth.
В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet().
Реализовать функционал метода readKeyFromConsoleAndInitPlanet():
для этого считай с консоли один параметр типа String.
если он равен одной из констант интерфейса Planet, создай соответствующий объект и присвой его Planet thePlanet, иначе — обнули Planet thePlanet.
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {



    }

    public static Planet  thePlanet;
    static {
            try {
                readKeyFromConsoleAndInitPlanet();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }





    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
       switch (s){
           case Planet.EARTH:
               thePlanet =  Earth.getInstance();
               break;
           case Planet.MOON:
               thePlanet=  Moon.getInstance();
               break;
           case Planet.SUN:
              thePlanet =  Sun.getInstance();
              break;
           default:thePlanet=null;
           break;

       }


        // implement step #5 here - реализуйте задание №5 тут
    }
}
