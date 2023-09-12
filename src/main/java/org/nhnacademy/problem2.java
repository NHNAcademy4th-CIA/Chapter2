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
    public static void number3(){
        logger.info("가지고 있는 쿼터는 얼마인가요? : ");
        int quarter = scanner.nextInt();
        logger.info("가지고 있는 다임은 얼마인가요? : ");
        int dime = scanner.nextInt();
        logger.info("가지고 있는 니켈은 얼마인가요? : ");
        int nickel = scanner.nextInt();
        logger.info("가지고 있는 페니는 얼마인가요? : ");
        int penny = scanner.nextInt();
        logger.info("당신이 가지고 있는 달러는 ? {} 달러입니다",Money.toDollar(penny,nickel,dime,quarter));
    }

    public static void number4(){
        logger.info("몇개의 계란을 가지고 있습니까? : ");
        int eggs = scanner.nextInt();
        int gross = eggs/144;
        eggs%=144;
        int dozen = eggs/12;
        eggs%=12;
        logger.info("Your number of eggs is {} gross, {} dozen, and {}",gross,dozen,eggs);
    }
    private static int dice() {
        return (int) (Math.random() * 6) + 1;
    }

    static class Money{
        private Money(){}
        private static double toDollar(int penny, int nickel, int dime, int quarter){
            return (double) (penny + (nickel * 5) + (dime * 10) + (quarter * 25)) /100;
        }
    }
}
