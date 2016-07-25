package com.javarush.test.level08.lesson08.task02;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashSet;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args) {

        removeAllNumbersMoreThan10(createSet());
    }
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1 ; i < 21; i++) {
            set.add(i);

        }
        return set;
        //напишите тут ваш код

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        HashSet<Integer> temp = new HashSet<>();
        for (Integer i : set) {
            if (i>10){
                temp.add(i);
            }
        }
        set.removeAll(temp);
        return set;
        //напишите тут ваш код

    }
}
