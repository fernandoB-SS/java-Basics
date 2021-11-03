package com.ss.week1.day2.day2_assignment;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class day2assignment3 {
    // Interface
    interface Shape {
        public void calculateArea(float base, float height, double rad); // interface method (does not have a body)

        public void display(); // interface method (does not have a body)
    }

    // Rectangle "implements" the Shape interface
    public static class Rectangle implements Shape {
        float area;

        public void calculateArea(float base, float height, double rad) {
            area = base * height;
        }

        public void display() {
            // The body of display() is provided here
            System.out.println("Rectangle area : " + area);
        }
    }

    // Triangle "implements" the Shape interface
    public static class Triangle implements Shape {
        float area;

        public void calculateArea(float base, float height, double rad) {
            area = (base * height) / 2;
        }

        public void display() {
            // The body of display() is provided here
            System.out.println("Triangle area: " + area);
        }
    }

    // Circle "implements" the Shape interface
    public static class Circle implements Shape {
        double area;

        public void calculateArea(float base, float height, double rad) {
            area = (rad * rad * Math.PI);
        }

        public void display() {
            // The body of display() is provided here
            System.out.println("Circle area: " + String.format("%,.2f", area));
        }
    }

    public static void main(String[] args) {
        System.out.println("Day 2 Assingment 3");
        Rectangle myRectangle = new Rectangle();
        Triangle myTriangle = new Triangle();
        Circle myCircle = new Circle();

        myRectangle.calculateArea(2, 3, 0);
        myRectangle.display();

        myTriangle.calculateArea(3, 3, 0);
        myTriangle.display();

        myCircle.calculateArea(0, 0, 4);
        myCircle.display();
    }
}
