package com.xsis.day06;

public class Car {
    String merek;
    String licensePlate;
    int speed;
    int engineTemperature;
    String gear;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Car(String licensePlate, int speed) {
        this.licensePlate = licensePlate;
        this.speed = speed;
    }

    public Car(String licensePlate, int speed, String gear) {
        this.licensePlate = licensePlate;
        this.speed = speed;
        this.gear = gear;
    }

    void start() {
        System.out.println("Car Start");
        engineTemperature = engineTemperature + 10;
        System.out.println("Merek Mobil : " + merek);
        System.out.println("License Plate : " + licensePlate);
        System.out.println("Gear : " + gear);
        System.out.println("Speed : " + speed + " KM/Hour");
        System.out.println("Engine Temperature : " + engineTemperature + " degrees Celcius");
        System.out.println();
    }

    void goFaster() {
        gear = "4";
        speed = speed + 100;
        engineTemperature = engineTemperature + 50;
        System.out.println("Car Go Faster");
        /* System.out.println("Merek Mobil : " + merek);
        System.out.println("License Plate : " + licensePlate);
        System.out.println("Gear change to: " + gear);
        System.out.println("Speed increase to : " + speed + " KM/Hour");
        System.out.println();*/
    }

    void goSlower() {
        gear = "2";
        speed = speed - 50;
        engineTemperature = engineTemperature - 30;
        System.out.println("Car Go Slower");
        /*System.out.println("Merek Mobil : " + merek);
        System.out.println("License Plate : " + licensePlate);
        System.out.println("Gear change to : " + gear);
        System.out.println("Speed increase to : " + speed + " KM/Hour");
        System.out.println();*/
    }

    void print() {
        System.out.println("Merek Mobil : " + merek);
        System.out.println("License Plate : " + licensePlate);
        System.out.println("Gear change to : " + gear);
        System.out.println("Speed increase to : " + speed + " KM/Hour");
        System.out.println("Engine Temperature change to : " + engineTemperature + " degrees Celcius");
        System.out.println();
    }
}
