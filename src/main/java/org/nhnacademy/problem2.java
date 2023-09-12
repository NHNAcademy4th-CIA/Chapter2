package org.nhnacademy;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class problem2 {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    private static Scanner scanner = new Scanner(System.in);
    private problem2() {
        number1();
    }


    public static void number1() {
        int first = dice();
        int second = dice();
        logger.info("The first die comes up" + "{}", first);
        logger.info("The second die comes up" + "{}", second);
        logger.info("Your total roll is " + "{}", first + second);
    }

    public static void number2(){
        String name = scanner.next();
        logger.info("Hello, {} nice to meet you!",name);
    }

    private static int dice() {
        return (int) (Math.random() * 6) + 1;
    }
}
