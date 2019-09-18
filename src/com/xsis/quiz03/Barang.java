package com.xsis.quiz03;

import java.time.LocalDate;

public class Barang {
    private String itemCode;
    private String itemName;
    private char size;
    private int qty;
    private double harga;
    private LocalDate TglMasuk;
    private double diskon;

    public Barang(String itemCode, String itemName, char size, int qty, double harga, LocalDate tglMasuk) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.size = size;
        this.qty = qty;
        this.harga = harga;
        this.TglMasuk = tglMasuk;
    }


    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public LocalDate getTglMasuk() {
        return TglMasuk;
    }

    public void setTglMasuk(LocalDate tglMasuk) {
        this.TglMasuk = tglMasuk;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }
}
