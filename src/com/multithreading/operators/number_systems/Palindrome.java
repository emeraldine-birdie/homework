package com.multithreading.operators.number_systems;

import java.util.HashSet;
import java.util.Set;

/*
Определить, в каких системах счисления (от 2 до 36 включительно) представление числа number
(передается в десятичной системе счисления) является палиндромом и добавить индекс таких систем в результат
*/

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(getRadix("112"));        //expected output: [3, 27, 13, 15]
        System.out.println(getRadix("123"));        //expected output: [6]
        System.out.println(getRadix("5321"));       //expected output: []
        System.out.println(getRadix("1A"));         //expected output: []
    }

    private static Set<Integer> getRadix(String number){
        Set<Integer> set = new HashSet<>();
        try {
            for (int i = 2; i <=36; i++){
                String s = Integer.toString(Integer.parseInt(number, 10), i);
                if (s.equals(new StringBuilder(s).reverse().toString())){
                    set.add(i);
                }
            }
        }
        catch (NumberFormatException e){
            set = new HashSet<>();
        }

        return set;
    }
}
