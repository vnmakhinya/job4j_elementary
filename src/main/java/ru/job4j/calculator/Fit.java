package ru.job4j.calculator;

public class Fit {

    public static double manHeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanHeight(short heightWoman) {
        double rsl = (heightWoman - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manHeight(height);
        System.out.println("Man 187 is " + man);
        short heightWoman = 170;
        double woman = Fit.womanHeight(heightWoman);
        System.out.println("Woman 170 is " + woman);
    }
}
