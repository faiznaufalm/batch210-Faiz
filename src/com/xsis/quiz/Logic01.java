package com.xsis.quiz;

import java.util.Scanner;

public class Logic01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan harga barang : ");
        double harga = scanner.nextDouble();
        System.out.println("Masukkan uang cash : " );
        double uang = scanner.nextDouble();

        System.out.println("Jumlah Kembalian : " + bayar(uang, harga));
    }

    public static double bayar(double u,double h) {
        double k = u-h;
    return k;
    }


}
