package com.ss.week1.day2.day2_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class day2assignment3 {
    // Interface
    interface Shape {
        public void calculateArea(float base, float height); // interface method (does not have a body)

        public void display(); // interface method (does not have a body)
    }

    // Rectangle "implements" the Animal interface
    public static class Rectangle implements Shape {

        public void calculateArea(float base, float height) {
            // The body of calculateAread() is provided here
            System.out.println("Rectangle area: " + base);
        }

        public void display() {
            // The body of display() is provided here
            System.out.println("Rectangle diplay: ");
        }
    }

    // Triangle "implements" the Animal interface
    public static class Triangle implements Shape {
        public void calculateArea(float base, float height) {
            // The body of calculateAread() is provided here
            System.out.println("Rectangle area: ");
        }

        public void display() {
            // The body of display() is provided here
            System.out.println("Rectangle diplay: ");
        }
    }

    // Circle "implements" the Animal interface
    public static class Circle implements Shape {
        public void calculateArea(float base, float height) {
            // The body of calculateAread() is provided here
            System.out.println("Rectangle area: ");
        }

        public void display() {
            // The body of display() is provided here
            System.out.println("Rectangle diplay: ");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Day2AssignmentApplication.class, args);
        System.out.println("Day 2 Assingment 3");
        Rectangle myRectangle = new Rectangle();
        myRectangle.calculateArea(2, 0);
        myRectangle.display();
    }
}
