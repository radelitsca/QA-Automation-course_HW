package com.test.homework.for_loop;

public class EvenNumbers {
    /*
    using for loop
    print even number from 1 to 100 include
    from new line
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
        if (i % 2 == 0)
            System.out.println(i);
        }
    }
}