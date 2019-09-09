package com.xsis.quiz;

//jawaban masih belum sesuai pertanyaan / mash SALAH
public class Logic08 {
    public String produk;
    public double harga;

    public Logic08(String produk, double harga) {
        this.produk = produk;
        this.harga = harga;
    }


    public static void main(String[] args) {
       Logic08 p1 = new Logic08("Kopi", 10000.00);
       Logic08 p2 = new Logic08("Gula", 1000.00);
       Logic08 p3 = new Logic08("Indomie", 3000.00);

       p3.hitung();

    }

    void hitung() {
        double total;
        total = harga + harga + harga;
        System.out.println(produk);
        System.out.println(harga);
    }
}
