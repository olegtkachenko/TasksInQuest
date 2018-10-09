package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        long start = new Date(new Date(date).getYear(), 0, 1).getTime();
        long end = new Date(date).getTime();
        return (((end - start) / (1000 * 24 * 60 * 60)) - 1) % 2 != 0;
    }
}
