package com.xsis.quiz02;

public class Student {
    private String nim;
    private String nama;
    private String jurusan;
    static int totalStudent = 0;

    public Student(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        totalStudent ++;
    }

    /*public static int Hitung(){
    return totalStudent;
    }*/

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "Student{" +
                "NIM = '" + nim + '\'' +
                ", Nama = '" + nama + '\'' +
                ", Jurusan = '" + jurusan + '\'' +
                '}';
    }
}
