package com.xsis.quiz06;

import java.util.Scanner;

public class testScore {

    void testScore(Scanner sc) {
        int avg = 0;
        int sumScore = 0;
        int n = 6;
        String gradeLetter = null;
        for (int i = 1; i < n ; i++) {
            int[] score = new int[n];
            System.out.print("Enter the score for the test " + i + ": ");
            score[i] = sc.nextInt();
            sumScore = (sumScore + score[i]);
            avg = sumScore/5;
            if (avg >= 90) {
                gradeLetter = "A";
            } else if (avg >= 80) {
                gradeLetter = "B";
            } else if (avg >= 70) {
                gradeLetter = "C";
            } else if (avg >= 60) {
                gradeLetter = "D";
            } else {
                gradeLetter = "F";
            }
        }
        System.out.println(avg + "%");
        System.out.println("Your letter grade is " + gradeLetter);
        sc.close();
    }

}
