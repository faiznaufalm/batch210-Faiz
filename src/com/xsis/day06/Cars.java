package com.xsis.day06;

public class Cars {
    public static void main(String [] args) {
        //object ke-1
        Car nissan = new Car("D 37 MAN");
        nissan.merek = "Nissan";
        nissan.speed = 0;
        nissan.gear = "N";
        nissan.engineTemperature = 0;

        //object ke-2
        Car mitsubishi = new Car("B 12 AY", 0);
        mitsubishi.merek = "Mitsubishi";
        mitsubishi.gear = "N";
        mitsubishi.engineTemperature = 0;

        //object ke-3
        Car toyota = new Car("B 1234 ABC", 0, "N");
        toyota.merek = "Toyota";
        toyota.engineTemperature = 0;

        nissan.start();

        nissan.goFaster();
        nissan.print();

        nissan.goSlower();
        nissan.print();

/*
        mitsubishi.start();
        mitsubishi.goFaster();
        mitsubishi.goSlower();

        toyota.start();
        toyota.goFaster();
        toyota.goSlower();
*/
    }
}
