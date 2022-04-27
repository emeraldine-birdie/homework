package com.multithreading.operators.number_systems;

public class ConvertToDecimal {

    public static void main(String[] args) {
        System.out.println(convertToDecimalSystem("0x16")); //22
        System.out.println(convertToDecimalSystem("012"));  //10
        System.out.println(convertToDecimalSystem("0b10")); //2
        System.out.println(convertToDecimalSystem("62"));   //62
    }

    public static String convertToDecimalSystem(String s) {
        //напишите тут ваш код
        Integer x;
        if (s.startsWith("0")){
            if (s.startsWith("0x")){
                x = Integer.parseInt(s.substring(2), 16);
            }
            else if (s.startsWith("0b")){
                x = Integer.parseInt(s.substring(2), 2);
            }
            else {
                x = Integer.parseInt(s.substring(1), 8);
            }
        }
        else {
            x = Integer.parseInt(s, 10);
        }
        s = x.toString();
        return s;
    }
}
