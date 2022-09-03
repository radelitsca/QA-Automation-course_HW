package com.test.homework.oop.interfaces;

public class Solution3 {
    /*
    There are interfaces Fly, Move, Eat.
    Add proper interfaces to the classes: Dog, Car, Duck, Airplane
     */

    interface Fly {
        void fly();
    }

    interface Move {
        void move();
    }

    interface Eat {
        void eat();
    }

    public class Dog implements Eat {

        @Override
        public void eat() {
            System.out.println("I'm hungry");
        }
    }

    public class Car implements Move {

        @Override
        public void move() {
            System.out.println("I'm moving across the road");
        }
    }

    public class Duck implements Eat {

        @Override
        public void eat() {
            System.out.println("I like to eat corn");
        }
    }

    public class Airplane implements Fly {

        @Override
        public void fly() {
            System.out.println("I'm flying in the sky");
        }
    }
}
