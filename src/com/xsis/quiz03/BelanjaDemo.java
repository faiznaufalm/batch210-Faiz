package com.xsis.quiz03;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class BelanjaDemo {
    public static void main(String[] args) {
        Belanja item = new Belanja("06-478", "Shirt-Sport", "M", 100, 350000, LocalDate.of(2019, 8, 17), 0);
        Belanja item2 = new Belanja("06-420", "Shirt-Sport-Abu", "M", 120, 350000, LocalDate.of(2019, 8, 17), 0);
        Belanja item3 = new Belanja("01-100", "Baju Anak Sport", "M", 150, 150000, LocalDate.of(2019, 3, 15), 0);
        Belanja item4 = new Belanja("02-200", "Baju Wanita", "M", 160, 250000, LocalDate.of(2019, 9, 15), 0);

        Belanja[] listItem = {item, item2, item3, item4};
        Belanja[] listBelanjaBarang = new Belanja[10];
        double[] listHarga = new double[10];
        int[] listQty = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Apakah anda member ? (ya/tidak) ");
        String member = sc.nextLine();
        String pilih;
        String lanjut;
        int jmlh=0;
        Belanja barangTerpilih;

        do {
            showItem(listItem);
            System.out.print("Pilih Item : ");
            pilih = sc.nextLine();
            barangTerpilih = getItem(listItem, pilih);
            prosesBelanja(barangTerpilih);
            System.out.println("Lanjut Belanja ? (ya/tidak) ");
            lanjut = sc.nextLine();
        }while (lanjut.equalsIgnoreCase("ya"));
        //jmlh = prosesBelanja(barangTerpilih);
        prosesDiskon(barangTerpilih, member);
        prosesBayar(barangTerpilih, jmlh);

    }

    static void showItem(Belanja[] itemList) {
        System.out.printf("|Item Code \t | \t Item Name \t | \t Size \t | \t Stock \t | \t Harga \t |");
        System.out.println();
        for (int i = 0; i < itemList.length; i++) {
            System.out.printf("|" + itemList[i].getItemCode() + " \t | \t " + itemList[i].getItemName() + " \t | \t " + itemList[i].getSize() + " \t | \t " + itemList[i].getQty() + " \t | \t " + itemList[i].getHarga() + " \t |");

            System.out.println();
        }
    }

    static Belanja getItem(Belanja[] pilihItem, String code) {
        Belanja item = null;
        for (int i = 0; i < pilihItem.length; i++) {
            if (code.equals(pilihItem[i].getItemCode())) {
                item = pilihItem[i];
            }
        }
        return item;
    }

    static int prosesBelanja(Belanja item){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Barang : ");
        int jmlh = sc.nextInt();
        if (jmlh > item.getQty()) {
            System.out.println("Stock barang hanya " + item.getQty());
        } else {
            item.setQty(item.getQty() - jmlh);
        }
        return jmlh;
    }

    static void prosesDiskon(Belanja item, String member) {
        long daysBetween = ChronoUnit.DAYS.between(item.getTglMasuk(), LocalDate.now());
        double newDiskon = 0;
        if (member.equalsIgnoreCase("ya")) {
            if (daysBetween >= 30 && daysBetween < 60) {
                newDiskon = 50;
            } else if (daysBetween >= 60) {
                newDiskon = 70;
            } else {
                newDiskon = 10;
            }
        } else {
            if (daysBetween >= 30 && daysBetween < 60) {
                newDiskon = 40;
            } else if (daysBetween >= 60) {
                newDiskon = 60;
            }
        }
        item.setDiskon(newDiskon);
    }

    static void prosesBayar(Belanja item, int jmlh) {
        Scanner sc = new Scanner(System.in);
        double kembalian;
        double total;
        double diskonHarga;
        double newHarga = 0;
        double ppn = 5;
        double bayar;
       /* System.out.print("Masukkan Jumlah Barang : ");
        int jmlh = sc.nextInt();
        if (jmlh > item.getQty()) {
            System.out.println("Stock barang hanya " + item.getQty());
        } else {
            item.setQty(item.getQty() - jmlh);
        }
        System.out.println("Sisa barang : " + item.getQty());*/
        System.out.print("Jumlah Uang Tunai : ");
        double uang = sc.nextDouble();
        if (uang < item.getHarga()) {
            System.out.println("Uang kurang");
        } else {
            System.out.println("Harga Barang : " + item.getHarga());
            diskonHarga = item.getHarga() * (item.getDiskon() / 100);
            System.out.println("Diskon Barang : " + item.getDiskon() + "% (" + diskonHarga + ")");
            newHarga = item.getHarga() - diskonHarga;
            item.setHarga(newHarga);
            //System.out.println("Harga Barang Setelah Diskon : " + item.getHarga());
            total = item.getHarga() * jmlh;
            System.out.println("PPN : " + ppn + "%");
            ppn = total * (ppn / 100);
            bayar = total + ppn;
            System.out.println("Total yang harus dibayar : " + bayar);
            kembalian = uang - bayar;
            System.out.print("Kembalian : " + kembalian);
        }
    }

}
