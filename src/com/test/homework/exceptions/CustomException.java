package com.test.homework.exceptions;

public class CustomException extends IllegalArgumentException {
    public CustomException(String s) {
        super(s);
    }

    public static void print(int a) throws CustomException {
        if (a < 0) throw new CustomException("The value should be more than zero");
        System.out.println(a);
    }

    public static void main(String[] args) {
        print(5);

        try {
            print(-5);
        } catch (IllegalArgumentException e) {
            System.err.println("Exception was caught");
        }

        print(-5);


    }
}
