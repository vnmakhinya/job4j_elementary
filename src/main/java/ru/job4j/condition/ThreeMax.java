package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {

        if (first >= second && first >= third) {
            return first;
        }
        if (second >= first && second >= third) {
            return second;
        } else {
            return third;
        }
    }

    public static void main(String[] args) {
        System.out.println(max(190, 200, 200));
    }
}