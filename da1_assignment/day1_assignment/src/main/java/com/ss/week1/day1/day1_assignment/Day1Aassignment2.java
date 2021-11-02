package com.ss.week1.day1.day1_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner; // Import the Scanner class

@SpringBootApplication
public class Day1Aassignment2 {
    // Function random guess
    public static void randomGuess() {
        // generate random number from 1-100
        int rand_int2 = ThreadLocalRandom.current().nextInt(1, 6);
        // prompt user
        System.out.println("Range between 1 to 6: " + rand_int2);
        // scanner object
        Scanner scanObj = new Scanner(System.in);
        // store user integer guess
        int userGuess = scanObj.nextInt();
        if (userGuess == rand_int2) {
            System.out.println("Congratulations you won!");

        }
        // prompt user
        System.out.println("Guess: " + userGuess);
        // scanner object close
        scanObj.close();
    }

    public static void main(String[] args) {
        SpringApplication.run(Day1AssignmentApplication.class, args);
        // Welcome

        System.out.println("Week1 Day");
        // function call
        randomGuess();

    }
}
