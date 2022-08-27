package ru.job4j.condition;

import com.sun.source.util.SourcePositions;
import jdk.jshell.spi.ExecutionControl;

import java.net.SocketOption;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-3);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }

        if (number < 0) {
            System.out.println("This is negative number");
        }
    }
}
