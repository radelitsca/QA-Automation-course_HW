package com.test.homework.comparable_comparator;

import java.util.Comparator;

public class CatNameComparator implements Comparator<Cat2> {

    @Override
    public int compare(Cat2 cat1, Cat2 cat2) {
        return cat1.getName().compareTo(cat2.getName()) * -1;
    }

}

