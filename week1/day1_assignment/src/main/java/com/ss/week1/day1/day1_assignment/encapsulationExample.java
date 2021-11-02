package com.ss.week1.day1.day1_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// The meaning of Encapsulation, is to make sure that "sensitive" data is
// hidden from users. To achieve this, you must:
// declare class variables/attributes as private
// provide public get and set methods to access and update the value of a
// private variable
public class encapsulationExample {

    public static class Person {
        private String name; // private = restricted access

        // Getter
        public String getName() {
            return name;
        }

        // Setter
        public void setName(String newName) {
            this.name = newName;
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Day1AssignmentApplication.class, args);
        // Welcome
        System.out.println("Encapsulation");
        Person myObj = new Person();
        myObj.setName("John Smith"); // Set the value of the name variable to "John Smith"
        System.out.println(myObj.getName());

    }
}
