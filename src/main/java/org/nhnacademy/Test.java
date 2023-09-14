package org.nhnacademy;

import org.nhnacademy.textio.TextIO;

public class Test {
    public static void main(String[] args) {
        double param = TextIO.getlnDouble();
        System.out.println(param);
        param = TextIO.getDouble();
        System.out.println(param);
    }
}
