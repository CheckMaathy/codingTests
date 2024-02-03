package com.example.codingtest;

public class Main {
    public static void main(String[] args) {
        String input = "122aussua221";
        if(isPalindrome(input)) {
            System.out.println(input + " is palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        var simplified = simplifyString(str);
        var reversedSimplified = new StringBuilder(simplified).reverse().toString();

        return reversedSimplified.equals(simplified);
    }

    public static String simplifyString(String str) {
        return str.toLowerCase().replaceAll("[^a-z0-9]", "");
    }
}
