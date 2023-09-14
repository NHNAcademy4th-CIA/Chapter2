package org.nhnacademy.jmj;

import org.nhnacademy.textio.TextIO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("Please enter your first name and last name, separated by a space");
        String name = TextIO.getln();
        int space = name.indexOf(' ');
        TextIO.putln("Your first name is " + name.substring(0, space) + ", which has " + space + " characters");
        TextIO.putln("Your last name is " + name.substring(space + 1) + ", which has " + (name.length() - space - 1) +
                " characters");
        TextIO.putln("Your initials are " + name.charAt(0) + name.charAt(space+1));
    }
}
