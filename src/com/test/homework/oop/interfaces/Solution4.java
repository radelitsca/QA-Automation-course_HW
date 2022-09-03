package com.test.homework.oop.interfaces;

public class Solution4 {
    /*
    Create class Human
    Create interfaces Run, Swim
    Add 1 method to each interface
    Add these interfaces to class Human without method implementation
    Create Human class as abstract
     */

    public abstract class Human implements Run, Swim {

    }

    public interface Run {
        void run();
    }

    public interface Swim {
        void swim();
    }
}