package com.javarush.test.level08.lesson11.home09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date = reader.readLine();
        isDateOdd(date);

    }

    public static boolean isDateOdd(String date)
    {
        String[] s = date.split(" ");
        int month;
        int day;
        int year;
        switch (s[0]){
            case "JANUARY" : month = 0; break;
            case "FEBRUARY" : month = 1; break;
            case "MARCH" : month = 2; break;
            case "APRIL" : month = 3; break;
            case "MAY" : month = 4; break;
            case "JUNE" : month = 5; break;
            case "JULY" : month = 6; break;
            case "AUGUST" : month = 7; break;
            case "SEPTEMBER" : month = 8; break;
            case "OCTOBER" : month = 9; break;
            case "NOVEMBER" : month = 10; break;
            case "DECEMBER" : month = 11; break;
            default : month = 0; break;
        }

        day = Integer.parseInt(s[1]);
        year = Integer.parseInt(s[2]) - 1900;

        Date days = new Date(year,month,day);
        Date day0 = new Date(year, 1, 1);
        long msTimeDistance = days.getTime();
        long msTimeDistance0 = day0.getTime();
        msTimeDistance -= msTimeDistance0;
        long msDay = 24*60*60*1000;
        int dayCount = (int)(msTimeDistance/msDay)+1;
        if (dayCount%2 == 0){
            return true;
        }
        else return false;





    }
}
