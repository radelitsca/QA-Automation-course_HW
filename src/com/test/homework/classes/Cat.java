package com.test.homework.classes;

public class Cat {
    String name;
    int age;
    int weight;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public static void main(String[] args) {
        Cat markis = new Cat();
        markis.setName("Markis");
        markis.setAge(2);
        markis.setWeight(5);

        Cat murka = new Cat();
        murka.setName("Murka");
        murka.setAge(3);
        murka.setWeight(4);

        Cat lolik = new Cat();
        lolik.setName("Lolik");
        lolik.setAge(5);
        lolik.setWeight(3);

        resultOfFight(lolik, markis);
        resultOfFight(lolik, murka);
        resultOfFight(markis, murka);
    }

    public static void resultOfFight(Cat cat1, Cat cat2) {
        if (cat1.fight(cat2))
            System.out.println("В бою переміг " + cat1.name + ".  " + cat2.name + " програв.");
        else
            System.out.println("В бою переміг " + cat2.name + "." + cat1.name + " програв.");
    }

    public boolean fight(Cat anotherCat) {
        int strength1;
        strength1 = (this.getAge()) * 2 + (this.getWeight() * 5);
        int strength2;
        strength2 = (anotherCat.getAge()) * 3 + (anotherCat.getWeight() * 5);

        return strength1 >= strength2;
    }
}
