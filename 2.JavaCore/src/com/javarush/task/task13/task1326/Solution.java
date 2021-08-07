package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Сортировка четных чисел из файла
*/


public class Solution {
    public static void main(String[] args) throws IOException{
// напишите тут ваш код
        BufferedReader readTrackFile = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader fis = new BufferedReader(new InputStreamReader(new FileInputStream(readTrackFile.readLine())))) {
            ArrayList sf = new ArrayList<>();
            String line = " ";
            while ((line = fis.readLine()) != null) {
                int x = Integer.parseInt(line);
                if (x % 2 == 0) {
                    sf.add(x);
                }
            }
            Collections.sort(sf);
            for (Object i : sf) {
                System.out.println(i);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}



/*
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        FileReader NameFile = new FileReader(reader.readLine());//ввел имя файла
        BufferedReader reader1 =new BufferedReader(NameFile);//считывание файла
        ArrayList<Integer> list  = new ArrayList<Integer>();
        String line ="";
        while ((line=reader.readLine())!=null){//проверка на то что значение не пустое
          int j = Integer.parseInt(line);
          if (j%2==0) list.add(j);
        }
        reader1.close();

        Collections.sort(list);

        for (int t : list){
            System.out.println(t);

        }


*/
