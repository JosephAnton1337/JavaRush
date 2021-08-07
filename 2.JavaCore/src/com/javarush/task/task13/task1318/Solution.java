package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException { // незабываем ставить исключение


        try { // или обвернуть в трай-кэтч
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // считываем с клавы
            String nameFile = reader.readLine();  // записываем в переменную считаное с клавы

            InputStream inStream = new FileInputStream(nameFile); //считываем файл по введёному пути
            BufferedReader bif = new BufferedReader(new InputStreamReader(inStream)); //читает построчно с файла

            while (bif.ready()) { System.out.println(bif.readLine());} // цикл построчного чтения файла вроде бы как

            inStream.close(); // закрытие входящего потока от чтения с клавиатуры
            bif.close();// закрытие входящего потока от чтения файла
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
