package com.javarush.task.task08.task0817;

import java.util.*;

/*
Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.


Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> map = new HashMap<>();
        map.put("Смирнов", "Сильвестр");
        map.put("Иванов", "Дмитрий");
        map.put("Кузнецов", "Арнольд");
        map.put("Соколов", "Роман");
        map.put("Попов", "Максим");
        map.put("Лебедев", "Ярослав");
        map.put("Новиков", "Александр");
        map.put("Козлов", "Михаил");
        map.put("Морозов", "Алексей");
        map.put("Петров", "Алексей");
        return map;
        //напишите тут ваш код

    }


    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);

        for (String itr : copy.values()){
            int count = 0;
            for (String Nametemp : copy.values()){
                if (itr.equals(Nametemp)){
                    count++;
                }
            }
            if (count>1){
                removeItemFromMapByValue(map,itr);
            }
        }

        }

        //напишите тут ваш код



    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
var map = createMap();

System.out.println(map);

    }
}
