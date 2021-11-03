package com.ss.week1.day2.day2_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class day2assignment2 {
    final static int N = 4;
    final static int M = 4;

    // Function to find max element
    // mat[][] : 2D array to find max element
    static int findMax(int mat[][]) {

        // Initializing max element as INT_MIN
        int maxElement = Integer.MIN_VALUE;

        // checking each element of matrix
        // if it is greater than maxElement,
        // update maxElement
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (mat[i][j] > maxElement) {
                    maxElement = mat[i][j];
                }
            }
        }
        // finally return maxElement
        return maxElement;
    }

    public static void main(String[] args) {
        SpringApplication.run(Day2AssignmentApplication.class, args);
        System.out.println("Day 2 Assingment 2");
        // matrix
        int myArray[][] = { { 1, 2, 3, 4 }, { 25, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        System.out.println(findMax(myArray));
    }
}
