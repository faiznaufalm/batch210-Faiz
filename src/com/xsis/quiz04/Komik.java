package com.xsis.quiz04;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Komik {
    public Peminjaman getKomik(Peminjaman[] listPeminjaman, String judul){
        Peminjaman komik = null;
        for (int i = 0; i <listPeminjaman.length; i++) {
            if (judul.equals(listPeminjaman[i].getNama())) {
                komik = listPeminjaman[i];
            } /*else  {
                System.out.println("Judul Salah");
            }*/
        }
        return komik;
    }

    public void prosesSewa(Peminjaman peminjaman, LocalDate datePinjam, LocalDate dateKembali){
        double sewa = 2500;
        double denda = 550;
        double totalDenda = 0;
        double totalSewa;
        double totalBayar;
        long telat = 0;
        long daysBetween = ChronoUnit.DAYS.between(datePinjam, dateKembali);
        int x= (int) daysBetween;
        if (daysBetween > 7) {
            telat = x - 7;
            totalDenda = denda * telat;
            totalSewa = sewa * daysBetween;
            totalBayar = totalSewa + totalDenda;
            System.out.println("Jumlah Hari Pinjam : " + daysBetween + " Hari");
            System.out.println("Telat : " + telat + " Hari");
            System.out.println("Denda : " + totalDenda);
            System.out.println("Biaya Sewa : " + totalSewa);
            System.out.println("Total Biaya Sewa : " + totalBayar);
        } else {
            totalSewa = sewa * daysBetween;
            totalBayar = totalSewa + totalDenda;
            System.out.println("Jumlah Hari Pinjam : " + daysBetween + " Hari");
            System.out.println("Telat : " + telat + " Hari");
            System.out.println("Denda : " + totalDenda);
            System.out.println("Biaya Sewa : " + totalSewa);
            System.out.println("Total Biaya Sewa : " + totalBayar);
        }
    }
}
