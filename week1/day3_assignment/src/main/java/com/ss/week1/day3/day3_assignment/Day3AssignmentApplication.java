package com.ss.week1.day3.day3_assignment;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day3AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day3AssignmentApplication.class, args);
		System.out.println("Day 3 Assignment 1");
		// Provide full path for directory(change
		// accordingly)
		String maindirpath = "/Users/Fernz./Desktop/";

		// File object
		File maindir = new File(maindirpath);
		if (maindir.exists() && maindir.isDirectory()) {

			// array for files and sub-directories
			// of directory pointed by maindir
			File arr[] = maindir.listFiles();

			System.out.println("**********************************************");
			System.out.println("Files from main directory : " + maindir);
			System.out.println("**********************************************");

			// Calling recursive method
			RecursivePrint(arr, 0, 0);
		}

	}//

	static void RecursivePrint(File[] arr, int index, int level) {
		// terminate condition
		if (index == arr.length)
			return;

		// tabs for internal levels
		for (int i = 0; i < level; i++)
			System.out.print("\t");

		// for files
		if (arr[index].isFile())
			System.out.println(arr[index].getName());

		// for sub-directories
		else if (arr[index].isDirectory()) {
			System.out.println("[" + arr[index].getName() + "]");

			// recursion for sub-directories
			RecursivePrint(arr[index].listFiles(), 0, level + 1);
		}

		// recursion for main directory
		RecursivePrint(arr, ++index, level);
	}

}
