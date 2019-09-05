package com.xsis.day07;

public class Mobil extends Vehicles {
    private int pintu;
    private String tipe;

    public Mobil(String jenis, String merek, String model, int roda, int kapasitas, int pintu, String tipe) {
        super(jenis, merek, model, roda, kapasitas);
        this.pintu = pintu;
        this.tipe = tipe;
    }

    public int getPintu() {
        return pintu;
    }

    public void setPintu(int pintu) {
        this.pintu = pintu;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Pintu = " + pintu +
                " Tipe = " + tipe;
    }
}
