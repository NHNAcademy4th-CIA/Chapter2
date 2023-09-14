package org.nhnacademy.lsj;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem4 {


    private static final Logger logger = LoggerFactory.getLogger(Problem4.class);

    public static void main(String[] args) {

        printUserMoneny();

    }

    public static void printUserMoneny(){
        Scanner sc = new Scanner(System.in);

        double result = 0;

        for (Money a : Money.values()) {

            logger.info("How Many you have {} ?", a);

            int num = sc.nextInt();

            result += num * a.getValue();
        }

        logger.info("User Total Money {}", result/100);
    }



}

enum Money {

    QUARTER(25),
    DIME(10),
    NICKEL(5),
    PENNY(1);

    public int getValue() {
        return value;
    }

    private final int value;

    private Money(int value) {
        this.value = value;
    }


}


