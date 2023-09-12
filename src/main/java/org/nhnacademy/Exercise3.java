package org.nhnacademy;

import java.util.Scanner;
import org.nhnacademy.textio.TextIO;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("what's your name?");
        String name = TextIO.getlnWord();
        System.out.println("Hello, " + name.toUpperCase() + ", nice to meet you!");
    }
}
