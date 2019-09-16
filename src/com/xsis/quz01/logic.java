package com.xsis.quz01;

import java.util.Scanner;

public class logic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah uang : ");
        double uang = sc.nextDouble();
        System.out.println("Lama deposit : ");
        int lamaDeposit = sc.nextInt();
        System.out.println("Jumlah bunga :");
        double bunga = sc.nextDouble();

        //System.out.println("Jumlah uang : " + (int)hasilDeposit(uang,lamaDeposit,bunga));
        logic nasabah = new logic();
        nasabah.hasilDeposit(uang, lamaDeposit, bunga);
    }

    double hasilDeposit(double uang, int lamaDeposit, double bunga){
        double totalUang = uang;
        double totalDeposit;
        for (int i = 0; i < lamaDeposit; i++) {
            totalDeposit = bunga * totalUang;
            totalUang = totalUang + totalDeposit;
            System.out.println("Jumlah deposit : " + totalDeposit);
            System.out.println("Total uang tahun ke - " + i + " = " + (int)totalUang);
        }
        return totalUang;
    }

}
