package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        Random random = new Random();
        HashMap<String,String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(String.valueOf(i), String.valueOf(random.nextInt(5)));
        }
        return map;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, LinkedList<String>> names = new HashMap<>();
        for (Map.Entry<String, String> entry :
                map.entrySet()) {
            LinkedList<String> list;
            String name = entry.getValue();
            if(names.containsKey(name)){
                list = names.get(name);
            }else{
                list = new LinkedList<>();
                names.put(name,list);
            }
            list.add(entry.getKey());
        }

        for (Map.Entry<String, LinkedList<String>> entry :
                names.entrySet()) {
            if (entry.getValue().size() > 1){
                for (String s :
                        entry.getValue()) {
                 map.remove(s);
                }
            }
        }
        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
