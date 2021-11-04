package com.ss.week1.day3.day3_assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class day3Assignment2 {
    public static void main(String[] args) {

        try {
            String data = " Tutorials Point is a best website in the world";
            File f1 = new File(
                    "/Users/Fernz./Desktop/FernzCode/SS/week1/java-basics/week1/day3_assignment/src/test/java/com/ss/week1/day3/day3_assignment/appendText2.txt");
            if (!f1.exists()) {
                f1.createNewFile();
            }

            FileWriter fileWritter = new FileWriter(f1.getName(), true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            bw.write(data);
            bw.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
