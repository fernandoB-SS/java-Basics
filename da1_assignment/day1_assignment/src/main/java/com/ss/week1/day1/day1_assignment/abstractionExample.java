package com.ss.week1.day1.day1_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Data abstraction is the process of hiding certain details and showing only essential information to the user.
// Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).
// The abstract keyword is a non-access modifier, used for classes and methods:
// Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
// Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
@SpringBootApplication
public class abstractionExample {
    // Abstract class
    public static abstract class Animal {
        // Abstract method (does not have a body)
        public abstract void animalSound();

        // Regular method
        public void sleep() {
            System.out.println("Zzz");
        }
    }
    // Subclass (inherit from Animal)

    static class Pig extends Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: oink oink");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Day1AssignmentApplication.class, args);
        System.out.println("Welcome");
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
