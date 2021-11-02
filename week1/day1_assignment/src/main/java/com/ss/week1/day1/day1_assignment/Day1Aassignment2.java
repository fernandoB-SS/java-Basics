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
        int randInt = ThreadLocalRandom.current().nextInt(1, 100);
        // variable declaration
        int numberOfGuesses = 5;
        boolean gameOver = false;
        // random + 10 & random -10 to set range to guess
        int upperLimit = randInt + 10;
        int lowerLimit = randInt - 10;

        // prompt user
        System.out.println("Range between 1 to 100: " + randInt);
        // scanner object
        Scanner scanObj = new Scanner(System.in);
        // store user integer guess
        int userGuess = scanObj.nextInt();

        // while loop
        while (gameOver == false) {
            if (userGuess == randInt) {
                System.out.println("Congratulations you won!");
                gameOver = true;
            } else if (userGuess > lowerLimit && userGuess < upperLimit) {
                System.out.println("Upper Limit:" + upperLimit + "\nLowerLimit: " + lowerLimit);
                System.out.println("Congratulations you won!");
                gameOver = true;
            } else if (numberOfGuesses == 0) {
                System.out.println("Congratulations you won!");
                gameOver = true;
            } else {
                numberOfGuesses--;
                System.out.println("Number of tries: " + numberOfGuesses);
                System.out.println("Please try again");
                // store user integer guess
                userGuess = scanObj.nextInt();
            }
        }
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
