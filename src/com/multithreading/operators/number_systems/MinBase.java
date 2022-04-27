package com.multithreading.operators.number_systems;

/*
Нужно реализовать программу, которая по входящей строке определит, является ли содержимое строки
записью числа в системе счисления с основанием не больше 36 включительно.
Если является - нужно вывести минимальное основание системы счисления, в которой это число может существовать.
Если не является - необходимо вывести "incorrect".
*/

import java.util.regex.Pattern;

public class MinBase {
    public static void main(String[] args) {
        String line = null;
        try {
            line = args[0];
            Pattern pattern = Pattern.compile("[^\\dA-Za-z]");
            if (pattern.matcher(line).find()) {
                System.out.println("incorrect");
            } else {
                char max = 0;
                char[] chars = line.toUpperCase().toCharArray();
                for (char current : chars) {
                    if (current > max) {
                        max = current;
                    }
                }
                int radix;
                if (max <= '9') {
                    radix = max - 47;
                } else {
                    radix = max - 54;
                }
                if (radix < 2) {
                    radix = 2;
                }
                System.out.println(radix);
            }
        } catch (Exception e) {
        }
    }
}
