package com.test.homework.oop.encapsulation;

public class Cat3 {
    /*
    Close access to all internal variables
    and methods that allow changing internal state objects of class Cat.
    */

    private String name;
    private int age;
    private int weight;
    private String color;

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}