package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        int i;
        for (i = 0; i <= 5; i++) {
            sum = sum + i;
        }
        return sum;
    }

      public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(2, 6));
        System.out.println(sum(6, 6));

    }
}

