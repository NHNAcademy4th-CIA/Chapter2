package org.nhnacademy.jmj;

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
        double quarter = scanner.nextDouble();
        System.out.println("how many dimes");
        double dime = scanner.nextDouble();
        System.out.println("how many nickels");
        double nickel = scanner.nextDouble();
        System.out.println("how many pennies");
        double penny = scanner.nextDouble();

        // in dollars
        System.out.println("you have : $" + toDollar(quarter, dime, nickel, penny));
    }

    private static double toDollar(double quarter, double dime, double nickel, double penny) {
        return quarter * 0.25 + dime * 0.10 + nickel * 0.05 + penny * 0.01;
    }
}
