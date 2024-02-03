package com.example.codingtest.livecoding;

import com.example.codingtest.livecoding.PalindromeVerifier;
import org.junit.jupiter.api.Test;

import static com.example.codingtest.livecoding.PalindromeVerifier.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeVerifierTest {

    @Test
    void isPalindrome_NotPalindrome() {
        var input = "apple";
        var result = isPalindrome(input);
        var expectedResult = input + " is not a palindrome";

        assertEquals(expectedResult, result);
    }

    @Test
    void isPalindrome_Palindrome() {
        var input = "1 level 1";
        var result = isPalindrome(input);
        var result2 = isPalindrome(" ");

        var expectedResult = input + " is palindrome";
        var expectedResult2 = "  is palindrome";

        assertEquals(expectedResult, result);
        assertEquals(expectedResult2, result2);
    }

    @Test
    void isPalindrome_PalindromeNull() {
        var result = isPalindrome(null);

        var expectedResult = "input cannot be null";

        assertEquals(expectedResult, result);
    }

    @Test
    void simplifyString() {
        var str = "1 level 1";
        var result = PalindromeVerifier.simplifyString(str);

        assertEquals("1level1", result);
    }
}