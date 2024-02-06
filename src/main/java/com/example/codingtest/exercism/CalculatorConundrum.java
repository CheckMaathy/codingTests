package com.example.codingtest.exercism;


/**
 * In this exercise you will be building error handling for a simple integer calculator.
 * To make matters simple, methods for calculating addition, multiplication and division are provided.
 *
 * The goal is to have a working calculator that returns a String with the following pattern: 16 + 51 = 67,
 * when provided with arguments 16, 51 and +.
 */
public class CalculatorConundrum {

    private static String EQUALS_SIGNAL = " = ";

    public static void main(String[] args) {

    }

    /**
     * The main method for implementation in this task will be the CalculatorConundrum.calculate() method.
     * It takes three arguments. The first two arguments operand1 and operand2 are integer numbers on which
     * an operation is going to operate. The third argument operation is of type String and for this exercise
     * it is necessary to implement the following operations:
     * - addition using the + String
     * - multiplication using the * String
     * - division using the / String
     *
     * @param operand1
     * @param operand2
     * @param operation
     * @return
     */
    public static String calculate(int operand1, int operand2, String operation) throws IllegalOperationException {
        String response;
        int result;

        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        switch (operation) {
            case "+":
                result = operand1 + operand2;
                response = operand1 + " + " + operand2 + EQUALS_SIGNAL + result;
                break;
            case "*":
                result = operand1 * operand2;
                response = operand1 + " * " + operand2 + EQUALS_SIGNAL + result;
                break;
            case "/":
                if (operand2 == 0) {
                    throw new IllegalOperationException("Division by zero is not allowed");
                }
                result = operand1 / operand2;
                response = operand1 + " / " + operand2 + EQUALS_SIGNAL + result;
                break;
            case "":
                throw new IllegalArgumentException("Operation cannot be empty");
            default:
                throw new IllegalOperationException("Operation" + operation + " does not exist");
        }
        return response;
    }

    public static class IllegalOperationException extends RuntimeException {
        public IllegalOperationException(String errorMessage) {
            super(errorMessage);
        }

        public IllegalOperationException(String errorMessage, Throwable cause) {
            super(errorMessage, cause);
        }
    }

}
