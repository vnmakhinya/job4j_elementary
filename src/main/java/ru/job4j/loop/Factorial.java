package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        int i;
        for (i = 1; i <= 5; i *= n) {
            result = n * i;
        }
        return result;
    }

}
