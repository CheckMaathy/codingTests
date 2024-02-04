package com.example.codingtest.exercism;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnnalynsInfiltrationTest {

    @Test
    void canFastAttack_true() {
        assertTrue(AnnalynsInfiltration.canFastAttack(false));
    }

    @Test
    void canFastAttack_false() {
        assertFalse(AnnalynsInfiltration.canFastAttack(true));
    }

    @Test
    void canSpy_PrisionerAwake() {
        assertTrue(AnnalynsInfiltration.canSpy(false, false, true));
    }

    @Test
    void canSpy_KnightAwake() {
        assertTrue(AnnalynsInfiltration.canSpy(true, false, false));
    }

    @Test
    void canSpy_KnightAndPrisionerAwake() {
        assertTrue(AnnalynsInfiltration.canSpy(true, false, true));
    }

    @Test
    void canSpy_EverybodySleeping() {
        assertFalse(AnnalynsInfiltration.canSpy(false, false, false));
    }

    @Test
    void canSignalPrisoner() {
    }

    @Test
    void canFreePrisoner() {
    }
}