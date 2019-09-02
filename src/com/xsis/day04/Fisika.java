package com.xsis.day04;

public class Fisika {
    public static void main(String[] args) {
        Fisika F = new Fisika();

        double k1 = F.kalor(5, 4.2, 10.5);
        double k2 = F.kalor(5, 5.5, 10.5);
        double x = k1 + k2;
        System.out.println("Kalor 1 = " + k1 + " Kalor 3 = "+k2);
        F.kalor(5,10.5);
        System.out.println("Kalor 4 = "+x);
        int k5 = F.kalor();
        System.out.println("Kalor 5 = " +k5);
        F.testException();
    }

    double kalor (double m, double c, double dt) {
        return m*c*dt;
    }

    void kalor(double m, double dt) {
        double c = 4.2;
        double x = m*c*dt;
        System.out.println("Kalor 2 = " + x );
    }

    int kalor() {
        return 5*4*3;
    }

    void testException() {
        int a[] = new int [3];
        try {
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " +e);
        } finally {
            a[0]=7;
            System.out.println("Element pertama pada array adalah : "+a[0]);
            System.out.println("Final");
        }
        System.out.println("Diluar...");
    }
}
