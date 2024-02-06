package com.example.codingtest.exercism;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorConundrumTest {

    @Test
    @DisplayName("The calculate method returns the correct result when dividing small operands")
    void divisionWithSmallOperandsTest() throws CalculatorConundrum.IllegalOperationException {
        assertEquals("72 / 9 = 8", CalculatorConundrum.calculate(72, 9, "/"));
    }

    @Test
    @DisplayName("The calculate method returns the correct result when dividing large operands")
    public void divisionWithLargeOperands() {
        assertEquals("1338800 / 83675 = 16", CalculatorConundrum.calculate(1_338_800, 83_675, "/"));
    }

    @Test
    @DisplayName("The calculate method returns the correct result when multiplying small operands")
    public void multiplicationWithSmallOperands() {
        assertEquals("3 * 21 = 63", CalculatorConundrum.calculate(3, 21, "*"));
    }

    @Test
    @DisplayName("The calculate method returns the correct result when multiplying large operands")
    public void multiplicationWithLargeOperands() {
        assertEquals("72441 * 2048 = 148359168", CalculatorConundrum.calculate(72_441, 2_048, "*"));
    }

    @Test
    @DisplayName("The calculate method throws IllegalArgumentException when passing empty operation")
    public void throwExceptionForAnEmptyStringOperation() {
        assertThrows(IllegalArgumentException.class, () -> CalculatorConundrum.calculate(34, 324, ""), "Operation cannot be empty");
    }

    @Test
    @DisplayName("The calculate method returns the correct result when adding small operands")
    public void additionWithSmallOperands() {
        assertEquals("22 + 25 = 47", CalculatorConundrum.calculate(22, 25, "+"));
    }

    @Test
    @DisplayName("The calculate method returns the correct result when adding large operands")
    public void additionWithLargeOperands() {
        assertEquals("378961 + 399635 = 778596", CalculatorConundrum.calculate(378_961, 399_635, "+"));
    }

    @Test
    @DisplayName("The calculate method throws IllegalArgumentException when passing null operation")
    public void throwExceptionForNullAsOperation() {
        assertThrows(IllegalArgumentException.class, () -> CalculatorConundrum.calculate(34, 324, null), "Operation cannot be null");
    }

    @Test
    @DisplayName("The calculate method throws IllegalOperationException when passing invalid operation")
    public void throwExceptionForUnknownOperation() {
        String invalidOperation = "**";
        String expectedMessage = String.format("Operation '%s' does not exist", invalidOperation);
        assertThrows(CalculatorConundrum.IllegalOperationException.class, () -> CalculatorConundrum.calculate(34, 324, invalidOperation), expectedMessage);
    }

    @Test
    @DisplayName("The calculate method throws IllegalOperationException when dividing by zero")
    public void throwExceptionForDivisionByZero() {
        assertThrows(CalculatorConundrum.IllegalOperationException.class, () -> CalculatorConundrum.calculate(34, 0, "/"), "Division by zero is not allowed");
    }
}