package com.cc.java;

public class Cat {
    
    private String name;
    private String furColor;
    private int age;

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    /** Getter */

    public String getName() {
        return this.name; 
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }


}
