package com.ss.week1.day2.day2_assignment;

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
        int index1 = 0;
        int index2 = 0;
        // update maxElement
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (mat[i][j] > maxElement) {

                    maxElement = mat[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("index-I: " + index1 + " index-J: " + index2);

        // finally return maxElement
        return maxElement;
    }

    public static void main(String[] args) {
        System.out.println("Day 2 Assingment 2");
        // matrix
        int myArray[][] = { { 1, 2, 3, 4 }, { 23, 6, 7, 8 }, { 9, 44, 11, 12 }, { 13, 14, 15, 16 } };

        System.out.println(findMax(myArray));
    }
}
