
package com.test.homework.for_loop;

public class PrintRightTriangle {
    /*
    using for loop print right triangle from 8
    with size 10*10
    Example:
    8
    88
    888
    8888
    .....
     */
    public static void main(String args[]) {
                for (int i = 1; i <= 10; i++) {
                   PrintSeveralTimes(i);
                }
        }
        public static void PrintSeveralTimes(int a) {
        for (int k = 1; k<=a; k++) {
            System.out.print(8);
        }
        System.out.println();
        }
    }
