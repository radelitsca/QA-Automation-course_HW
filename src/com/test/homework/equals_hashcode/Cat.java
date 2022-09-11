package com.test.homework.equals_hashcode;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Objects;

public class Cat {
    /*
    Override methods equals() and hashCode() that it took @name and @age
    Create several object with the same names and ages and different and print the result of comparing
    Override toString method - when we call System.out.println(cat) -> it should print: "Cat name: Tom, age: 5, weight: 3"
     */

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 12, 4);
        Cat cat2 = new Cat("Murka", 5, 2);
        Cat cat3 = new Cat("Tom", 12, 5);

        System.out.println(cat1.equals(cat3));
        System.out.println(cat2.equals(cat1));

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());

        System.out.println(cat1.toString());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Cat name: " + name + ", age: " + age + ", weight: " + weight;
    }
}