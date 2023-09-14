package org.nhnacademy.lsj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import textio.TextIO;

public class Problem6 {

    private static final Logger logger = LoggerFactory.getLogger(Problem6.class);

    public static void main(String[] args) {


        logger.info("Please enter your first name and last name, separated by a space");

        String name = TextIO.getln();

        int spaceIdx = name.indexOf(" ");

        StringBuilder sb = new StringBuilder();

        String firstName = name.substring(0, spaceIdx);
        String lastName = name.substring(spaceIdx + 1);

        String initials = firstName.substring(0, 1) + lastName.substring(0, 1);


        logger.info("Your first name is {}, which has {} chracters\n" +
                        "Your last name is {}, which has {} chracters\n" +
                        "Your initals are {}"
                , firstName, firstName.length(), lastName
                , lastName.length(), initials
        );


    }

}
