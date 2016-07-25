package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static void main(String[] args) {
        createSet();
    }
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<String>();

        set.add("Лампа");
        set.add("Литр");
        set.add("Люстра");
        set.add("Лед");
        set.add("Линкор");
        set.add("Лава");
        set.add("Лев");
        set.add("Ложка");
        set.add("Линза");
        set.add("Лак");
        set.add("Лимон");
        set.add("Лошадь");
        set.add("Лол");
        set.add("Лисица");
        set.add("Лама");
        set.add("Леприкон");
        set.add("Лажа");
        set.add("Лето");
        set.add("Лектор");
        set.add("Лекция");

        return set;
                //напишите тут ваш код

    }
}
