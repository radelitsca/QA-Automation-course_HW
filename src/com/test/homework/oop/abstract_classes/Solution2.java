package com.test.homework.oop.abstract_classes;

public class Solution2 {
    /*
    Extend classes Cat and Dog from Pet
    Implement all the necessary methods
    Classes Cat and Dog should not be abstract
     */

    public static abstract class Pet {
        String name;
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet{

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }
}