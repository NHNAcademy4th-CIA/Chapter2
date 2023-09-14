package org.nhnacademy.jmj;

import java.io.FileNotFoundException;
import org.nhnacademy.textio.TextIO;

public class Exercise7 {
    public static void main(String[] args) {
        // name of student
        // scores on three exams

        try {
            TextIO.readFile("src/main/resources/testdata.txt");
            String name = TextIO.getlnString();
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum+=TextIO.getInt();
            }
            TextIO.putln("student name : " + name + ", score avg : " + sum / 3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
