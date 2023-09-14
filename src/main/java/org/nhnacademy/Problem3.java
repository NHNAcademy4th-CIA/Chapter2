package org.nhnacademy;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem3 {

    private static final Logger logger = LoggerFactory.getLogger(Problem3.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        logger.info("사용자 이름을 입력해 주세요");
        String userName = sc.next();

        userName=userName.toUpperCase();

        logger.info("Hello, {}, 만나서 반가워요!", userName);
    }
}
