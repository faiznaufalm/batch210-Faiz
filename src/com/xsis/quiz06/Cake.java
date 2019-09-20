package com.xsis.quiz06;

import java.util.Scanner;

public class Cake {

    void calories() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kue yang kamu makan ? ");
        double kue = sc.nextInt();
        int kalori = 300;
        double totalKalori = 0;
        double porsi = kue/4;
        totalKalori = porsi*kalori;

        System.out.println("Kamu makan " + totalKalori +" kalori !");
    }

}
