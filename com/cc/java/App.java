package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat1 = new Cat("Grizabella", "white", 29);
        output("Name: " + cat1.getName());
        output("Fellfarbe " + cat1.getFurColor());
        output("Alter: " + cat1.getAge());

        output("-------------");

        Cat cat2 = new Cat("Alonzo", "grey", 35);

        output("Name: " + cat2.getName());
        output("Fellfarbe " + cat2.getFurColor());
        output("Alter: " + cat2.getAge());
        
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

