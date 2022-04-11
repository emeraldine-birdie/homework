package com.arrays.continue_the_sequence;

import java.util.Arrays;

public class SequenceE {
    //Продолжить следующий числовой ряд: 1, -1,  1,  -1,   1,  -1...
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArrayOfIntegers(6)));
    }

    public static int[] createArrayOfIntegers(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (i%2==0){
                array[i] = 1;
            }
            else {
                array[i] = -1;
            }
        }
        return array;
    }
}
