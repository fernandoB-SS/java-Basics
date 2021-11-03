package com.ss.week1.day2.day2_assignment;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class day2assignment1 {

    private static Integer parseInput(String input) {
        try {
            return Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println(input + " is not a valid number. Please make sure all arguments are whole numbers");
            System.exit(0);
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Day 2 Assingment 1");

        var sumTotal = 0;

        for (var argument : args)
            sumTotal += parseInput(argument);

        System.out.println("Total: " + sumTotal);
    }
}
