package org.nhnacademy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem7 {

    private static final Logger logger = LoggerFactory.getLogger(Problem7.class);

    private static final String regex = "^[0-9]*$";

    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new FileReader(
                "src/main/resources/testdata.txt"));

        String str;
        double avg = 0;

        while ((str = bufferedReader.readLine()) != null) {
            logger.info(str);
            if (Pattern.matches(regex, str)) {
                avg += Double.parseDouble(str);
            }
        }

        logger.info("{}", avg / 3);


    }

}
