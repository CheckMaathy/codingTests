package com.example.codingtest;

/*
 *  Verify if an alphanumeric input is palindrome or not
 */
public class PalindromeVerifier {
    public static void main(String[] args) {
        String input = "122aussua221";
        var result = isPalindrome(input);
        System.out.println(result);
    }

    public static String isPalindrome(String str) {
        if (str == null) {
            return "input cannot be null";
        }
        var simplified = simplifyString(str);
        var reversedSimplified = new StringBuilder(simplified).reverse().toString();

        if (reversedSimplified.equals(simplified)) {
            return str + " is palindrome";
        }
        return str + " is not a palindrome";
    }

    public static String simplifyString(String str) {
        return str.toLowerCase().replaceAll("[^a-z0-9]", "");
    }
}
