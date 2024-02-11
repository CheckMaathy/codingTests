package com.checkmaathy.codingtest.livecoding;

import java.util.stream.IntStream;

public class ChenPrimeProblem {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static boolean chenPrime(int p) {
        if (isPrime(p)) {
            return IntStream.of(p + 2, p + 4, p + 2 * p, p + 4 * p)
                    .anyMatch(ChenPrimeProblem::isPrime);
        }
        return false;
    }

    public static void main(String[] args) {
        int p = 5; // Example prime number
        if (chenPrime(p)) {
            System.out.println(p + " satisfies the Chen prime property.");
        } else {
            System.out.println(p + " does not satisfy the Chen prime property.");
        }
    }
}
