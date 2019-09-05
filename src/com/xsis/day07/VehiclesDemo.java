package com.xsis.day07;

public class VehiclesDemo {
    public static void main(String[] args) {
        Vehicles v1 = new Vehicles("Mobil", "Honda", "Sedan", 4, 4);
        System.out.println(v1.toString());
        System.out.println();

        Mobil m1 = new Mobil("Mobil", "Nissan", "Tuner", 4, 2, 2, "GT-R");
        System.out.println(m1.toString());
        System.out.println();

    }
}
