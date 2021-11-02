package com.ss.week1.day1.day1_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day1AssignmentApplication {
	// Righ triangle function
	// takes int n parameter
	public static void rightTriangle(int n) {
		// int counter varibables for rows and columns
		int i, j;
		// outer-for loop to create # of rows
		for (i = 0; i < n; i++) {
			// inner-for loop to create # of columns
			for (j = 0; j <= i; j++) {
				// print number of columns
				System.out.print("* ");
			}
			// new column
			System.out.println();
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(Day1AssignmentApplication.class, args);
		// Welcome
		System.out.println("Week1 Day");
		// calling right triangle passing int 5
		rightTriangle(5);
	}

}
