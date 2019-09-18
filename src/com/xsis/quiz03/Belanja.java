package com.xsis.quiz03;

import java.time.LocalDate;

public class Belanja {
    private String  itemCode;
    private String itemName;
    private String size;
    private int qty;
    private double harga;
    LocalDate tglMasuk;
    private double diskon;/*
    SimpleDateFormat date = new SimpleDateFormat(tglMasuk);
    String tanggal = date.format(new Date());*/

    public Belanja(String itemCode, String itemName, String size, int qty, double harga, LocalDate tglMasuk, double diskon) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.size = size;
        this.qty = qty;
        this.harga = harga;
        this.tglMasuk = tglMasuk;
        this.diskon = diskon;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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
        return tglMasuk;
    }

    public void setTglMasuk(LocalDate tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }


   /* @Override
    public String toString() {
        return "Belanja{" +
                "itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", size='" + size + '\'' +
                ", qty=" + qty +
                ", harga=" + harga +
                ", tglMasuk='" + tglMasuk + '\'' +
                ", diskon=" + diskon +
                '}';
    }*/
}
