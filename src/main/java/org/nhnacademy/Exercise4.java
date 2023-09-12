package org.nhnacademy;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        /**
         * quarter : 25cents, 0.25 of dollars
         * dimes : 0.10 dollars
         * nickels : 0.05 dollars
         * pennies : 0.01 dollars
         */
        double dollars = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many quarters");
        dollars += scanner.nextDouble() * 0.25;
        System.out.println("how many dimes");
        dollars += scanner.nextDouble() * 0.10;
        System.out.println("how many nickels");
        dollars += scanner.nextDouble() * 0.05;
        System.out.println("how many pennies");
        dollars += scanner.nextDouble() * 0.01;

        // in dollars
        System.out.println("you have : $" + dollars);
    }
}
