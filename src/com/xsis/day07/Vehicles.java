package com.xsis.day07;

public class Vehicles {
    private String jenis;
    private String merek;
    private String model;
    private int roda;
    private int kapasitas;

    public Vehicles(String jenis, String merek, String model, int roda, int kapasitas) {
        if (roda < 2) throw new IllegalArgumentException("Roda minimal 2");
        this.jenis = jenis;
        this.merek = merek;
        this.model = model;
        this.roda = roda;
        this.kapasitas = kapasitas;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    @Override
    public String toString() {
        return "Vehicles : " +
                "Jenis = '" + jenis + '\'' +
                ", Merek = '" + merek + '\'' +
                ", Model = '" + model + '\'' +
                ", Roda = " + roda +
                ", Kapasitas = " + kapasitas;
    }
}
