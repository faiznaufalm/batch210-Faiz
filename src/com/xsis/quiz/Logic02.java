package com.xsis.quiz;

import java.util.Scanner;

public class Logic02 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Empty String
        String primeNumbers = "";
        System.out.println("Masukkan angka n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Bilangan prma dari 1 sampai ke n adalah : " + prima(primeNumbers, n));
    }
        public static String prima(String primeNumbers, int n) {
            int i = 0;
            int num = 0;
            for (i = 1; i <= n; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        /*System.out.println("Bilangan prma dari 1 sampai ke n adalah :");
        System.out.println(primeNumbers);*/
        return primeNumbers;
    }
}
