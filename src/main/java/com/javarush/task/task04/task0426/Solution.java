package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int rez = Math.abs(a) % 2;

        if (a == 0) {
            System.out.println("ноль");
            return;
        }

        if (a < 0 && rez == 0)
            System.out.println("отрицательное четное число");

        if (a < 0 && rez == 1)
            System.out.println("отрицательное нечетное число");

        if (a > 0 && rez == 0)
            System.out.println("положительное четное число");

        if (a > 0 && rez == 1)
            System.out.println("положительное нечетное число");

    }
}

