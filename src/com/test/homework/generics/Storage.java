package com.test.homework.generics;

import java.util.ArrayList;
import java.util.List;

class Storage<T> {

    public List<T> array = new ArrayList<>();

    public void put(T element) {
        array.add(element);
    }

    public T get() {
        T last = array.get(array.size() - 1);
        array.remove(array.size() - 1);
        return last;
    }

}