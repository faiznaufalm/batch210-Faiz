package com.xsis.quz01;

import java.util.Scanner;

public class logic02 {
    public static void main(String[] args) {
        logic02 costumer = new logic02();
        logic02 costumer2 = new logic02();
        costumer.logic2(245,0.2,5,0.55,9.5);

        Scanner sc =  new Scanner(System.in);
        System.out.print("Harga : ");
        double harga = sc.nextDouble();
        System.out.print("Bunga : ");
        double bunga = sc.nextDouble();
        System.out.print("Tenor : ");
        int tenor = sc.nextInt();
        System.out.print("Biaya Admin : ");
        double biayaAdmin = sc.nextDouble();
        System.out.print("Premi : ");
        double premi = sc.nextDouble();

        costumer2.logic2(harga,bunga,tenor,biayaAdmin,premi);
    }

    void logic2 (double harga, double bunga, int tenor, double biayaAdmnin, double premi){
        double dp = 0.2 * harga;
        System.out.println("DP : " +dp);
        double plafon = harga - dp;
        System.out.println("Plafon : " + plafon);
        double totalBunga = plafon * ((bunga * tenor)/100);
        double angsuran = ((plafon + (totalBunga) / (tenor * 12)));
        double premiAsuransi = ((premi / 100) * harga) / 12;
        double angsuranBulan1 = dp + angsuran + premiAsuransi + biayaAdmnin;

        System.out.println("Total Besar Bunga : " + totalBunga + " Juta");
        System.out.println("Angsuran Bulanan : " +angsuran+ " Juta");
        System.out.println("Angssuan Bulan Pertama : " + (int)angsuranBulan1 + " Juta");
    }
}
