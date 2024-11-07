package ru.mirea.task20.opt4;

public class Calculator {

    public static <T extends Number, U extends Number> double sum(T a, U b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, U extends Number> double multiply(T a, U b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, U extends Number> double divide(T a, U b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number, U extends Number> double subtraction(T a, U b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + Calculator.sum(5, 3.5));
        System.out.println("Multiply: " + Calculator.multiply(2, 4.5));
        System.out.println("Divide: " + Calculator.divide(10, 2));
        System.out.println("Subtraction: " + Calculator.subtraction(8, 3.2));
    }
}