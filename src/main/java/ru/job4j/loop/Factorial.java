package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        int i;
        for (i = 0; i <= n; i++) {
            result = n * i;
        }
        return result;
    }

}
