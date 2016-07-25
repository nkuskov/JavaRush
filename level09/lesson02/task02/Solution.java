package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();
        StackTraceElement[] stak = Thread.currentThread().getStackTrace();
        return stak[2].getMethodName();
        //напишите тут ваш код

    }

    public static String method2()
    {
        method3();
        StackTraceElement[] stak = Thread.currentThread().getStackTrace();
        return stak[2].getMethodName();
        //напишите тут ваш код

    }

    public static String method3()
    {
        method4();
        StackTraceElement[] stak = Thread.currentThread().getStackTrace();
        return stak[2].getMethodName();
        //напишите ту
        // т ваш код

    }

    public static String method4()
    {
        method5();
        StackTraceElement[] stak = Thread.currentThread().getStackTrace();
        return stak[2].getMethodName();
        //напишите тут ваш код

    }

    public static String method5()
    {
        StackTraceElement[] stak = Thread.currentThread().getStackTrace();
        return stak[2].getMethodName();
        //напишите тут ваш код

    }
}
