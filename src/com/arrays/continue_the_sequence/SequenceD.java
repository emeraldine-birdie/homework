package com.arrays.continue_the_sequence;

import java.util.Arrays;

public class SequenceD {
    //Продолжить следующий числовой ряд: 1,  8,  27,  64,  125...
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArrayOfIntegers(5)));
    }

    public static int[] createArrayOfIntegers(int n) {
        int[] array = new int[n];
        for (int i = 1; i <= n; i++) {
            array[i-1] = i*i*i;
        }
        return array;
    }
}
