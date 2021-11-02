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
        int randInt = ThreadLocalRandom.current().nextInt(1, 6);

        int upperLimit = randInt + 10;
        int lowerLimit = randInt - 10;
        // prompt user
        System.out.println("Range between 1 to 6: " + randInt);
        // scanner object
        Scanner scanObj = new Scanner(System.in);
        // store user integer guess
        int userGuess = scanObj.nextInt();
        if (userGuess == randInt) {
            System.out.println("Congratulations you won!");

        } else if (userGuess > lowerLimit && userGuess < upperLimit) {
            System.out.println("Upper Limit:" + upperLimit + "\nLowerLimit: " + lowerLimit);
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
