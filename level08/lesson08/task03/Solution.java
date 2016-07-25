package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String > map= new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String si = Integer.toString(i);
            map.put(si,si);
        }
        return map;
        //напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int result = 0;
        for (Map.Entry<String,String> entry: map.entrySet()) {
            if (Objects.equals(entry.getValue(),name)){
                result++;
            }
        }
        //напишите тут ваш код
        return result;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int result = 0;
        for(Map.Entry<String,String> entry: map.entrySet()){
            if (Objects.equals(entry.getKey(),lastName)){
                result++;
            }
        }
        return result;
        //напишите тут ваш код

    }


}
