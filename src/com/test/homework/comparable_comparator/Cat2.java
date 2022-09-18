package com.test.homework.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cat2 implements Comparable<Cat2> {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Cat2> cats = new ArrayList<>();
        Cat2 mur = new Cat2("Mur", 2);
        Cat2 pushok = new Cat2("Pushok", 4);
        Cat2 sharik = new Cat2("Sharik", 3);

        cats.add(mur);
        cats.add(pushok);
        cats.add(sharik);

        System.out.println("Sort by name");
        Collections.sort(cats);
        for (Cat2 cat : cats) {
            System.out.println(cat);
        }

        System.out.println("Sort by name (reverse)");
        Collections.sort(cats, new CatNameComparator());


        for (Cat2 cat : cats) {
            System.out.println(cat);
        }
        System.out.println("Sort by age ascending");
        Collections.sort(cats, new CatAgeComparatorASC());


        for (Cat2 cat : cats) {
            System.out.println(cat);
        }
        System.out.println("Sort by age descending");
        Collections.sort(cats, new CatAgeComparatorDESC());


        for (Cat2 cat : cats) {
            System.out.println(cat);
        }
    }

    @Override
    public int compareTo(Cat2 cat) {
        return name.compareTo(cat.getName());
    }
}
