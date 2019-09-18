package com.xsis.quiz03;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

    public class Cashier {

        public static void main(String[] args) {
            Barang brg1=new Barang("06-478","Shirt Sport",'M',100,350000, LocalDate.of(2019,8,17));
            Barang brg2=new Barang("06-420","Shirt Sport Abu",'M',120,350000,LocalDate.of(2019,8,17));
            Barang brg3=new Barang("01-100","Baju Anak Sport",'M',150,150000,LocalDate.of(2019,3,15));
            Barang brg4=new Barang("02-200","Baju Wanita",'M',160,250000,LocalDate.of(2019,9,15));
            Barang[] listBarang={brg1,brg2,brg3,brg4};
            Cashier struck1=new Cashier();
            Barang[] listBelanjaBarang = new Barang[10];
            double[] listHarga=new double[10];
            int[] listQTY=new int[10];
            int totalBarang=0;
            Scanner scan =new Scanner(System.in);
            String lanjut;
            String member;
            System.out.println("Apakah anda member ? (y/n)");
            member=scan.next();
            do {
                struck1.showStokBarang(listBarang);
                System.out.println("Silahkan masukan kode barang");
                String kodeBarang=scan.next();

                Barang barang = struck1.findBarang(kodeBarang,listBarang);
                long lama=struck1.getLamaBarang(barang);

                barang.setDiskon(struck1.ProsesDiskon(lama,member));

                System.out.println("Silahkan masukan jumlah barang ");
                int jumlah=scan.nextInt();

                double harga = struck1.getHargaBarang(barang,jumlah);
                double dis = struck1.getBesarDiskon(harga,barang.getDiskon());
                double total = struck1.getTotalBelanjaan(harga,dis);
                int sisaBarang=(barang.getQty()-jumlah);
                if (barang.getItemCode().equalsIgnoreCase(kodeBarang)){
                    barang.setQty(sisaBarang);
                }
                System.out.println("total "+total);
                listBelanjaBarang[totalBarang]=barang;
                listHarga[totalBarang]=harga;
                listQTY[totalBarang]=jumlah;
                totalBarang++;
                System.out.println("Apakah ada barang lain yang ingin anda beli [Y/T] ");
                lanjut=scan.next();
            } while (lanjut.equalsIgnoreCase("y"));
            System.out.println("Item \t Jumlah \t Harga/pcs \t Total \t Diskon ");
            for (int i=0;i<totalBarang;i++){
                System.out.println(listBelanjaBarang[i].getItemName()+"\t"
                        +listQTY[i]+"\t"+listBelanjaBarang[i].getHarga()+"\t"+listHarga[i]+"\t"+(listBelanjaBarang[i].getDiskon()*listHarga[i]));
            }
            double totalHargaKeseluruhan=struck1.getTotalHarga(listBelanjaBarang,listQTY,totalBarang);
            double totalDiskonKeseluruhan =struck1.getTotalDiskon(listBelanjaBarang,listHarga,totalBarang);
            double hargaTotalPotongDiskon=struck1.getHargaTotalPotongDiskon(totalHargaKeseluruhan,totalDiskonKeseluruhan);

            struck1.printDetail(totalHargaKeseluruhan, totalDiskonKeseluruhan, hargaTotalPotongDiskon);

        }

        public double getTotalHarga(Barang[] barang, int[] listQty,int totalBarang){
            double total=0;
            for (int i = 0; i <totalBarang ; i++) {
                total=(barang[i].getHarga()*listQty[i])+total;
            }
            return total;
        }

        void showStokBarang(Barang[] barang){
            System.out.println("Kode Barang \t Nama Item \t\t Stock \t Size \t Harga ");
            for (int i = 0; i <barang.length ; i++) {
                System.out.println(barang[i].getItemCode()+"\t\t\t"+barang[i].getItemName()+"\t\t"+barang[i].getQty() + "\t\t" +barang[i].getSize() + "\t" + barang[i].getHarga());
            }
        }

        public double getTotalDiskon(Barang[] barang, double[] listharga,int totalBarang){
            double totalDiskon=0;
            for (int i = 0; i <totalBarang ; i++) {
                totalDiskon =totalDiskon+(barang[i].getDiskon()*listharga[i]);
            }
            return totalDiskon;
        }

        public double getHargaTotalPotongDiskon (double totalHarga,double totalDiskon){
            return totalHarga-totalDiskon;
        }

        public double getHargaBarang (Barang item, int jumlah){
            return item.getHarga()*jumlah;
        }

        public double getBesarDiskon(double hargaBarang,double diskon){
            return diskon*hargaBarang;
        }

        public double getTotalBelanjaan(double hargaBarang,double diskon){
            return  hargaBarang-diskon;
        }

        public Barang findBarang (String kodeBarang,Barang[] listBarang){
            Barang beli=null;
            for (int i = 0; i <listBarang.length ; i++) {
                if (listBarang[i].getItemCode().equalsIgnoreCase(kodeBarang)){
                    beli=listBarang[i];
                }
            }
            return beli;
        }

        void showBarang(Barang barang){
            System.out.println("Kode barang  "+barang.getItemCode());
            System.out.println("Nama barang  "+barang.getItemName());
            System.out.println("Ukuran       "+barang.getSize());
            System.out.println("Harga Barang "+barang.getHarga());
            System.out.println("Stok Gudang  "+barang.getQty());
        }

        public long getLamaBarang (Barang item){
            long lama = ChronoUnit.DAYS.between(item.getTglMasuk(),LocalDate.now());
            return lama;
        }

        public double ProsesDiskon (long lama, String member){
            double diskon=0;
            if (member.equalsIgnoreCase("y")) {
                if (lama >= 30 && lama < 60) {
                    diskon = 0.5;
                } else if (lama >= 60) {
                    diskon = 0.7;
                } else {
                    diskon = 0.1;
                }
            } else {
                if (lama >= 30 && lama < 60) {
                    diskon = 0.4;
                } else if (lama >= 60) {
                    diskon = 0.6;
                }
            }
            return diskon;
        }

        public void printDetail(double hargaFinal, double diskonFinal, double totalPotongDiskon){
            Scanner scan = new Scanner(System.in);
            System.out.println("Total  \t" + hargaFinal + "\t" + diskonFinal);
            System.out.println("Potong Diskon " + totalPotongDiskon);
            System.out.println("PPN 5% " + (0.05 * totalPotongDiskon));
            System.out.println("Jumlah yang harus anda bayar " + (totalPotongDiskon + (0.05 * totalPotongDiskon)));
            System.out.println("Masukan uang anda ");
            double uang=scan.nextDouble();
            System.out.println("Tunai \t" + uang);
            System.out.println("Kembalian \t" + (uang - (totalPotongDiskon + (0.05 * totalPotongDiskon))));


        }
    }

