package org.nhnacademy;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem4 {


    private static final Logger logger = LoggerFactory.getLogger(Problem4.class);

    public static void main(String[] args) {

        // 쿼터 다임 니켈 페니
        // 25 10   5  1

        Scanner sc = new Scanner(System.in);


        int result = 0;
        for (Money a : Money.values()) {

            logger.info("How Many you have {} ?", a);

            int num = sc.nextInt();

            result += num * a.getValue();
        }

        logger.info("User Total Money {}", result);


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

    Money(int value) {
        this.value = value;
    }


}


