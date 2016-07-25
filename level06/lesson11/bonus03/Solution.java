package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        arr[0] = Integer.parseInt(reader.readLine());
        arr[1] = Integer.parseInt(reader.readLine());
        arr[2] = Integer.parseInt(reader.readLine());
        arr[3] = Integer.parseInt(reader.readLine());
        arr[4] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < arr.length - 1 ; i++){
            boolean swaped = false;
            for (int j = 0; j < arr.length - i -1; j++) {
                int tmp;
                if(arr[j]>arr[j+1]){
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }

        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }

        //напишите тут ваш код
    }
}
