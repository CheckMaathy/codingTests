package com.example.codingtest;

import org.junit.jupiter.api.Test;

import static com.example.codingtest.PalindromeVerifier.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeVerifierTest {

    @Test
    void isPalindrome_NotPalindrome() {
        var str = "apple";
        var result = isPalindrome(str);

        assertFalse(result);
    }

    @Test
    void isPalindrome_Palindrome() {
        var str = "1 level 1";
        var result = isPalindrome(str);

        assertTrue(result);
    }

    @Test
    void simplifyString() {
        var str = "1 level 1";
        var result = PalindromeVerifier.simplifyString(str);

        assertEquals("1level1", result);
    }
}