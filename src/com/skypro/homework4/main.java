package com.skypro.homework4;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Task1");
        int personAge = 16;
        if(personAge>=18) {
            System.out.println("If person age is " + personAge + " , he is an adult");
        } else {
            System.out.println("If person age is " + personAge + " , he has not reached the age of majority, you need to wait a bit.");
        }

    }
    public static void task2() {
        System.out.println("Task2");
        int airTemp = 4;
        if (airTemp<5){
            System.out.println("On the street " + airTemp + " degrees, you need to wear a hat!");
        } else {
            System.out.println("On the street " + airTemp + " degrees, you can go without hat!");
        }
    }
    public static void task3(){
        System.out.println("Task3");
        int carSpeed = 61;
        if (carSpeed>60) {
            System.out.println("If car speed " + carSpeed + " km/h, you will have to pay a fine.");
        } else {
            System.out.println("If car speed " + carSpeed + " km/h, you can drive safely.");
        }
    }
    public static void task4(){
        System.out.println("Task4");
        int age = 21;
        boolean kindergarten = age>2 && age<=6;
        boolean school = age>6 && age<=18;
        boolean university = age>18 && age<=24;
        boolean work = age>24;
        if (kindergarten) {
            System.out.println("If person age " + age + " ears, then he needs go to kindergarten.");
        } else {
            if (school) {
                System.out.println("If person age " + age + " ears, then he needs go to school.");
            } else {
                if (university){
                    System.out.println("If person age " + age + " ears, then he needs go to university.");
                } else {
                    if (work) {
                        System.out.println("If person age " + age + " ears, then he needs go to work.");
                    }
                }
            }
        }
    }
    public static void task5(){
        System.out.println("Task5");
        int age = 7;
        boolean ageSmall = age<5;
        boolean ageMiddle = age >=5 && age <14;
        boolean ageHigh = age>=14;
        if (ageSmall) {
            System.out.println("If the child's age " + age + " years then he can't ride the attraction.");
        } else {
            if (ageMiddle) {
                System.out.println("If the child's age " + age + " years then he can ride the attraction only accompanied by an adult.");
            } else {
                if (ageHigh) {
                    System.out.println("If the child's age " + age + " years then he can ride the attraction without an adult.");
                }
            }
        }

    }
    public static void task6() {
        System.out.println("Task6");
        int person = 54;
        boolean seats = person <60;
        boolean standing = person >= 60 && person <102;
        boolean full = person >=102;
        if (seats) {
            System.out.println("The train have a sitting place.");
        } else {
            if (standing) {
                System.out.println("The train have a standing place.");
            } else {
                if (full) {
                    System.out.println("The train is already full.");
                }
            }

        }
    }
    public static void task7(){
        System.out.println("Task7");
        int one = 100;
        int two = 345;
        int three = 576;
        boolean oneMax = one > two && one > three;
        boolean twoMax = two > one && two > three;

        if (oneMax) {
            System.out.println(one + " is the biggest number.");
        } else {
            if (twoMax) {
                System.out.println(two + " is the biggest number.");
            } else {
                System.out.println(three + " is the biggest number.");
            }
        }
    }
}
