package org.nhnacademy;

import org.nhnacademy.textio.TextIO;

public class Exercise7 {
    public static void main(String[] args) {
        // name of student
        // scores on three exams

        try {
            TextIO.readFile("src/main/resources/testdata.txt");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        String name = TextIO.getlnString();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum+=TextIO.getInt();
        }
        TextIO.putln("student name : " + name + ", score avg : " + sum / 3);
    }
}
