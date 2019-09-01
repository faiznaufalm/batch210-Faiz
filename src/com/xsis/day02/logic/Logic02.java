package com.xsis.day02.logic;

public class Logic02 {
    public static void main(String[] args) {
        Logic02 lg = new Logic02();

        lg.logic02(7);

            }

    public void logic02(int i) {
        int angka = 2;
        for (int x = 0; x < i; x++) {
                System.out.print(angka+ " ");
                angka = angka + 2;
            }
        }
    }

