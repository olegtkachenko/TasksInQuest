package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {

        Man man1 = new Man("Иван",30,"Moscow");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);

        Man man2 = new Man("Федя",31,"Усть-Жопинск");
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        Woman woman1 = new Woman("Катерина",45,"Наро-Фоминск");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);

        Woman woman2 = new Woman("Юля",23,"Зеленоград");
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

        //напишите тут ваш код
    }

    public static class Man {

        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {

        private String name;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        private int age;
        private String address;
    }
}
