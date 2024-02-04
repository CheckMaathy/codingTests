package com.example.codingtest.exercism;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnnalynsInfiltrationTest {

    @Test
    @DisplayName("The canFastAttack method returns true when knight is sleeping")
    void canFastAttack_true() {
        assertTrue(AnnalynsInfiltration.canFastAttack(false));
    }

    @Test
    @DisplayName("The canFastAttack method returns false when knight is awake")
    void canFastAttack_false() {
        assertFalse(AnnalynsInfiltration.canFastAttack(true));
    }

    @Test
    @DisplayName("The canSpy method returns true when everyone but prisoner is sleeping")
    void canSpy_PrisionerAwake() {
        assertTrue(AnnalynsInfiltration.canSpy(false, false, true));
    }

    @Test
    @DisplayName("The canSpy method returns true when only knight is sleeping")
    void canSpy_KnightSleeping() {
        assertTrue(AnnalynsInfiltration.canSpy(false, true, true));
    }

    @Test
    @DisplayName("The canSpy method returns true when everyone is awake")
    void canSpy_EverybodyIsAwake() {
        assertTrue(AnnalynsInfiltration.canSpy(true, true, true));
    }

    @Test
    @DisplayName("The canSpy method returns false when everyone is sleeping")
    void canSpy_EverybodySleeping() {
        assertFalse(AnnalynsInfiltration.canSpy(false, false, false));
    }

    @Test
    @DisplayName("The canSignalPrisoner method returns false when prisoner is sleeping and archer is awake")
    void canSignalPrisoner_ArcherAwake() {
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(true, false));
    }

    @Test
    @DisplayName("The canSignalPrisoner method returns false when both prisoner and archer are sleeping")
    void canSignalPrisoner_BothSleeping() {
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(false, false));
    }

    @Test
    @DisplayName("The canSignalPrisoner method returns true when prisoner is awake and archer is sleeping")
    void canSignalPrisoner_ArcherSleeping() {
        assertTrue(AnnalynsInfiltration.canSignalPrisoner(false, true));
    }

    @Test
    @DisplayName("The canSignalPrisoner method returns false when both prisoner and archer are awake")
    void canSignalPrisoner_BothAwake() {
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(true, true));
    }

    @Test
    void canFreePrisoner() {
    }
}