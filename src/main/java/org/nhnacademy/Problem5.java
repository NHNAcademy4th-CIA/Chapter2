package org.nhnacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem5 {

    public static final Logger logger = LoggerFactory.getLogger(Problem5.class);


    public static void main(String[] args) {


        logger.info("How many eggs you have?");

        Scanner sc = new Scanner(System.in);

        int totalEgg = sc.nextInt();

        List<Integer> answer = new ArrayList<>();


        int[] arr = {144, 12, 1};


        for (int i = 0; i < arr.length; i++) {
            answer.add(totalEgg / arr[i]);
            totalEgg %= arr[i];
        }

        StringBuilder sb = new StringBuilder();

        sb.append("Your number of eggs is ").append(answer.get(0) + " gross,")
                .append(answer.get(1) + " dozen,")
                .append(" and " + answer.get(2));

        System.out.println(sb);

    }

}
