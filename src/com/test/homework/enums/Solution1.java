package com.test.homework.enums;

public class Solution1 {
    /*
    Implement method getLetterPosition
    It should return position of the letter
    Example: A - 1, B - 2
     */
    public static void main(String[] args) {
        System.out.println(Alphabet.A.getLetterPosition());
        System.out.println(Alphabet.G.getLetterPosition());
    }

    public enum Alphabet {
        A, B, C, D, E,
        F, G, H, I, J,
        K, L, M, N, O,
        P, Q, R, S, T,
        U, V, W, X, Y, Z;

        private int ordinal;

        int getLetterPosition() {
            System.out.print(Alphabet.this + " - ");
            return Alphabet.this.ordinal() + 1;
        }
    }
}