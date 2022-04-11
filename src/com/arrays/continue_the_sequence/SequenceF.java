package com.arrays.continue_the_sequence;

import java.util.Arrays;

public class SequenceF {
    //Продолжить следующий числовой ряд: 1, -2,  3,  -4,   5,  -6...
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArrayOfIntegers(6)));
    }

    public static int[] createArrayOfIntegers(int n) {
        int[] array = new int[n];
        for (int i = 1; i <= n; i++) {
            if ((i-1)%2==0){
                array[i-1] = i;
            }
            else {
                array[i-1] = -i;
            }
        }
        return array;
    }
}
