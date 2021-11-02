package com.ss.week1.day1.day1_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// Polymorphism means "many forms", and it occurs when we have many classes that
// are related to each other by inheritance.
// Like we specified in the previous chapter; Inheritance lets us inherit
// attributes and methods from another class. Polymorphism uses those methods to
// perform different tasks. This allows us to perform a single action in
// different ways.
public class polymorphismExample {
    public static class Animal {

        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }

    public static class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: oink oink");
        }
    }

    public static class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: woof woof");
        }

    }

    public static void main(String[] args) {
        SpringApplication.run(Day1AssignmentApplication.class, args);
        // Welcome
        System.out.println("Polymorphism");
        Animal myAnimal = new Animal(); // Create a Animal object
        Animal myPig = new Pig(); // Create a Pig object
        Animal myDog = new Dog(); // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

    }
}
