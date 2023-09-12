package org.nhnacademy;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how many eggs you have");
        int total = scanner.nextInt();
        int gross = total / Eggs.GROSS.number;
        total -= gross*Eggs.GROSS.number;
        int dozen = total / 12;
        total-=dozen*Eggs.DOZEN.number;
        int left = total;

        System.out.println("your number of eggs is " + gross + " gross, " + dozen + ", and " + left);
    }
}
enum Eggs {
    GROSS(144),
    DOZEN(12);

    public final int number;

    Eggs(int number) {
        this.number = number;
    }
}