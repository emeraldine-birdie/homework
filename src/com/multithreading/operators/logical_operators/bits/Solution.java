package com.multithreading.operators.logical_operators.bits;

/*
Необходимо реализовать публичный метод int resetLowerBits(int number), который обнуляет все биты в числе number,
кроме самого старшего равного единице, и возвращает это число.
ЗАПРЕЩЕНО создавать переменные, использовать циклы, условные операторы и прочее.
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int number = Integer.MAX_VALUE - 133;
        System.out.println(Integer.toString(number, 2));

        String result = Integer.toString(solution.resetLowerBits(number), 2);
        System.out.println(result);
    }

    public int resetLowerBits(int number) {
        //напишите тут ваш код
        number |= number >> 1;
        number |= number >> 2;
        number |= number >> 4;
        number |= number >> 8;
        number |= number >> 16;
        number &= ~number >> 1;
        return number;
    }
}
