package com.ss.week1.day4.day4_assignment;

public class DeadLock {
    String str1 = "Smooth";
    String str2 = "Stack";
    Thread trd1 = new Thread("Thread 1") {
        public void run() {
            while (true) {
                synchronized (str1) {
                    synchronized (str2) {
                        System.out.println(str1 + str2);
                    }
                }
            }
        }
    };
    Thread trd2 = new Thread("Thread 2") {
        public void run() {
            while (true) {
                synchronized (str2) {
                    synchronized (str1) {
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };

    public static void main(String a[]) {
        DeadLock mdl = new DeadLock();
        mdl.trd1.start();
        mdl.trd2.start();
    }
}
