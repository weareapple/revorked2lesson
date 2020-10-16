package com.company;

public class Animal {
    private String name;
    private int age ;

    public String getName() {
        return name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
