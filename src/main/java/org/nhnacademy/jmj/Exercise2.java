package org.nhnacademy.jmj;

public class Exercise2 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random()*6)+1;
        int number2 = (int)(Math.random()*6)+1;

        System.out.println("The first dice comes up " + number1);
        System.out.println("The second dice comes up " + number2);
        System.out.println("your total roll is " + (number1+number2));
    }
}
