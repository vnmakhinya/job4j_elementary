package ru.job4j.condition;

import java.sql.SQLOutput;

public class ThreeMax {
    public static int max(int first, int second, int third) {

        if (first > second && first > third) {
           int result = first;

        } else if (second > third) {
            int result = second;
        }
        return third;
        }

    public static void main(String[] args) {
        System.out.println(max(2, 20, 30));
    }
}

