package com.xsis.quiz;

import java.util.Scanner;

public class Logic03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nilai : ");
        int nilai = scanner.nextInt();
        String grade ="";

        System.out.println("Grade = " + penilaian(nilai,grade));
    }

    public static String penilaian(int n, String grade){
        if (n >= 90 && n <= 100){
            grade = "A";
        }
            else if
            (n >= 80 && n < 90) {
            grade = "B";
        }
            else if
            (n >= 70 && n < 80) {
            grade = "C";
        }
            else if
            (n >= 60 && n < 70) {
            grade = "D";
        }
            else if (n < 60) {
                grade = "F";
        }
        return grade;
    }
}
