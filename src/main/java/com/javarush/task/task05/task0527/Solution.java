package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Cat cat = new Cat("Tom",5,6);

        Dog dog = new Dog("Pec",3,7);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Cat  {
        String name;
        int age;
        int height;

        public Cat(String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }
    }

    public static class Dog  {
        String name;
        int age;
        int height;

        public Dog(String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }
    }

    //напишите тут ваш код
}
