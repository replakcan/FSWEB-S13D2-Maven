package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        isPalindrome(-1221);
        isPerfectNumber(28);
        numberToWords(34501);
    }

    public static boolean isPalindrome(int num) {
        int i = 0;
        String numToString = Integer.toString(num).replaceAll("-", "");
        int range = numToString.length();
        while (i < range) {
            if ( numToString.charAt(i) == numToString.charAt(range - (i + 1))){
                i++;
            } else {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++){
            if (num % i == 0) {
                sum += i;
                System.out.println("sum:" + sum);
            }
        }
        System.out.println("sum:" + sum);
        return sum == num;
    }
    public static String numberToWords(int num) {
    /*
    sayiyi string'e cevir, tum karakterleri gez, karaktere denk gelen yaziyi array'e pushla
     */

        if (num < 0){
            return "Invalid Value";
        }
        String numToString = Integer.toString(num);
        System.out.println(num);

        int range = numToString.length();

        String stringVersion = "";

        for (int i = 0; i < range; i++){
            switch (numToString.toCharArray()[i]){
                case '0':
                     stringVersion += "Zero ";
                    break;
                case '1':
                    stringVersion += "One ";
                    break;
                case '2':
                    stringVersion += "Two ";
                    break;
                case '3':
                    stringVersion += "Three ";
                    break;
                case '4':
                    stringVersion += "Four ";
                    break;
                case '5':
                    stringVersion += "Five ";
                    break;
                case '6':
                    stringVersion += "Six ";
                    break;
                case '7':
                    stringVersion += "Seven ";
                    break;
                case '8':
                    stringVersion += "Eight ";
                    break;
                case '9':
                    stringVersion += "Nine ";
                    break;
            }
        }
        System.out.println(stringVersion.trim());
        return stringVersion.trim();
    }

}
