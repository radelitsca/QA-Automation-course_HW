package com.test.homework.comparable_comparator;

import java.util.Comparator;

public class CatAgeComparatorDESC implements Comparator<Cat2> {

    @Override
    public int compare(Cat2 cat1, Cat2 cat2) {
        return cat2.getAge() - cat1.getAge();
    }

}