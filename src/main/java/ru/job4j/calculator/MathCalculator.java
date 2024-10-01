package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndDiv(double first, double second) {
        return sum(diff(first, second), div(first, second));
    }

    public static double all(double first, double second) {
        return sum(sumAndMultiply(first, second), diffAndDiv(first, second));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply() равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета diffAndDiv() равен: " + diffAndDiv(10, 20));
        System.out.println("Результат расчета all() равен: " + all(10, 20));
    }
}
