package com.arrays.continue_the_sequence;

import java.util.Arrays;

public class SequenceH {
    //Продолжить следующий числовой ряд: 1,  0,  3,   0,   5,   0,  7....
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArrayOfIntegers(7)));
    }

    public static int[] createArrayOfIntegers(int n) {
        int[] array = new int[n];
        for (int i = 1; i <= n; i=i+2) {
            array[i - 1] = i;
        }

        return array;
    }
}
