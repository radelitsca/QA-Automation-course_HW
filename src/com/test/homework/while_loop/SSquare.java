package com.test.homework.while_loop;

public class SSquare {
    /*
    print to console a square 10*10 with 'S'
    using loop while
     */
    public static void main(String[] args) {
        int i = 1;
        int j = 10;
        while (i <= 10) {
            PrintSeveralTimes(j);
            i++;
            System.out.println();
        }
    }
    public static void PrintSeveralTimes(int a){
        int k = 1;
        while (k<=a) {
            System.out.print('S');
            k++;
        }

    }
}