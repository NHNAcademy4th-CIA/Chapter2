package org.nhnacademy;

import java.io.*;
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

    public static String number2() {
        logger.info("이름을 입력하세요. : ");
        String name = scanner.next();
        logger.info("Hello, {} nice to meet you!", name.toUpperCase());
        return name;
    }

    public static double number3() {
        logger.info("가지고 있는 쿼터는 얼마인가요? : ");
        int quarter = scanner.nextInt();
        logger.info("가지고 있는 다임은 얼마인가요? : ");
        int dime = scanner.nextInt();
        logger.info("가지고 있는 니켈은 얼마인가요? : ");
        int nickel = scanner.nextInt();
        logger.info("가지고 있는 페니는 얼마인가요? : ");
        int penny = scanner.nextInt();
        double dollar = Money.toDollar(penny, nickel, dime, quarter);
        logger.info("당신이 가지고 있는 달러는 ? {} 달러입니다",dollar);
        return dollar;
    }

    public static String number4() {
        logger.info("몇개의 계란을 가지고 있습니까? : ");
        int eggs = scanner.nextInt();
        int gross = eggs / 144;
        eggs %= 144;
        int dozen = eggs / 12;
        eggs %= 12;
        logger.info("Your number of eggs is {} gross, {} dozen, and {}", gross, dozen, eggs);
        return gross + " "+ dozen+ " "+ eggs;
    }
    public static String number5() {
        logger.info("Please enter your first name and last name, separated by a space. : ");
        String name = scanner.nextLine();
        int space = name.indexOf(" ");
        String firstName = name.substring(0, space++);
        String secondName = name.substring(space);
        logger.info("Your first name is {}, which has {} characters", firstName, firstName.length());
        logger.info("Your first name is {}, which has {} characters", secondName, secondName.length());
        logger.info("Your initials are {}{}", firstName.charAt(0), secondName.charAt(0));
        return firstName.charAt(0)+""+secondName.charAt(1);
    }

    public static int number6() {
        File note = new File("src/main/resources/testdata.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(note));
            String name = br.readLine();
            int score1= Integer.parseInt(br.readLine());
            int score2= Integer.parseInt(br.readLine());
            int score3= Integer.parseInt(br.readLine());
            logger.info("{}의 평균 성적 {}",name,(score1+score2+score3)/3);
            return (score1+score2+score3)/3;

        }catch (IOException e)
        {
            logger.info("위치에 파일이 없습니다.");
        }
        return 0;
    }
    private static int dice() {
        return (int) (Math.random() * 6) + 1;
    }

    static class Money {
        private Money() {
        }

        private static double toDollar(int penny, int nickel, int dime, int quarter) {
            return (double) (penny + (nickel * 5) + (dime * 10) + (quarter * 25)) / 100;
        }
    }
}
