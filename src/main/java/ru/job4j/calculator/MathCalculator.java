package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return  difference(first, second)
                + division(first, second);
    }

    public  static double sumFourMethods(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                    + difference(first, second)
                        + division(first, second);

    }

    public static void main(String[] args) {
        System.out.println("Результат расчета 1-го и 2-го метода: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета 3-го и 4-го метода: " + differenceAndDivision(40, 10));
        System.out.println("Результат расчета 4-х методов: " + sumFourMethods(23, 34));
    }
}
