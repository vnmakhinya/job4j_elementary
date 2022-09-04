package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first > second && first >= third ? first : second;
        if (second > first && first > third) {
            result = second;
        }
        if (third > first && third > second) {
            result = third;
        }
        return result;
    }
}
