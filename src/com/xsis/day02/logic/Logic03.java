package com.xsis.day02.logic;

public class Logic03 {
    public static void main(String[] args) {
        Logic03 lg = new Logic03();

        lg.logic03(7);

    }

    public void logic03(int i) {
        int angka = 1;
        for (int x = 0; x < i; x++) {
            System.out.print(angka+ " ");
            angka = angka + 3;
        }
    }
}
