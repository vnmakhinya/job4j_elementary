package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            prime = false;
        }
        for (int i = 1; i <= number; i++) {
            if (number % 2 == 0) {
                prime = false;
                break;
            } else if ((number % i) == 0) {
                break;
            }
        }
        return prime;
    }
}