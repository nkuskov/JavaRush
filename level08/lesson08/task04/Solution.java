package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));

        for (int i = 0; i < 9; i++) {
            map.put(String.valueOf(i), new Date(i*10,i,i));
        }

        return map;

        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        HashSet<String> set = new HashSet<String>();
        for (Map.Entry<String, Date> entry :
                map.entrySet()) {
            if (entry.getValue().getMonth() >= Calendar.JUNE && entry.getValue().getMonth() <= Calendar.AUGUST) {
                set.add(entry.getKey());
            }
        }
        for (String s :
                set) {
            map.remove(s);
        }

        //напишите тут ваш код

    }
}
