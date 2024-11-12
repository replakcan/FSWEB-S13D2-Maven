package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        isPalindrome(-1221);
        isPerfectNumber(28);
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


}
