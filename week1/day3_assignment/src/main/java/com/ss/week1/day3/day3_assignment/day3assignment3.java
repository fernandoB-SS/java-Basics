package com.ss.week1.day3.day3_assignment;

import java.io.*;

public class day3assignment3 {

    public static void main(String[] args) throws IOException {
        FileInputStream fstream = new FileInputStream(
                "/Users/Fernz./Desktop/FernzCode/SS/week1/java-basics/week1/day3_assignment/src/test/java/com/ss/week1/day3/day3_assignment/appendText.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine = "";
        String str = "";
        while ((strLine = br.readLine()) != null) {

            str += strLine;
        }
        String st = str.replaceAll(" ", "");
        char[] third = st.toCharArray();
        System.out.println("Character     Total");
        for (int counter = 0; counter < third.length; counter++) {
            char ch = third[counter];
            int count = 0;
            for (int i = 0; i < third.length; i++) {
                if (ch == third[i])
                    count++;
            }
            boolean flag = false;
            for (int j = counter - 1; j >= 0; j--) {
                if (ch == third[j])
                    flag = true;
            }
            if (!flag) {
                System.out.println(ch + "                  " + count);
            }
        }
    }

}
