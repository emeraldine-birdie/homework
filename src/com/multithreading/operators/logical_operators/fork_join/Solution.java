package com.multithreading.operators.logical_operators.fork_join;

import java.util.concurrent.ForkJoinPool;

/*
Реализуй логику метода compute - число должно переводиться в двоичное представление.
Используй методы fork и join.
Пример функциональной реализации - метод binaryRepresentationMethod.
*/

public class Solution {
    private String binaryRepresentationMethod(int x) {
        int a = x % 2;
        int b = x / 2;
        String result = String.valueOf(a);
        if (b > 0) {
            return binaryRepresentationMethod(b) + result;
        }
        return result;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String result1 = solution.binaryRepresentationMethod(6);
        System.out.println(result1);

        System.out.println();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        String result2 = forkJoinPool.invoke(new BinaryRepresentationTask(6));
        System.out.println(result2);
    }
}
