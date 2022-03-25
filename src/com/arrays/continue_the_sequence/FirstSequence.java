package com.arrays.continue_the_sequence;

import java.util.Arrays;

public class FirstSequence {
    //Продолжить следующий числовой ряд: 1, 2, 3, 4, 5…
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArrayOfIntegers(10)));
    }

    public static int[] createArrayOfIntegers(int n) {
        int[] array = new int[n];
        for (int i = 1; i <= n; i++) {
            array[i-1] = i;
        }
        return array;
    }
}
