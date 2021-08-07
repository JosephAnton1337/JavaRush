package com.javarush.task.task13.task1319;

import java.awt.*;
import java.io.*;

/*
В этой задаче тебе нужно:
Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter outFile = new BufferedWriter(new FileWriter(reader.readLine()));

        String s;

        try {

            while (true){
                s = reader.readLine();
                if (!s.equals("exit")){
                    outFile.write(s + "\r\n");
                }else {
                    outFile.write(s);
                    outFile.flush();
                    break;
                }
            }
        }catch (IOException e){
            e.getStackTrace();
        }finally {
            outFile.close();
            reader.close();
        }
    }
}