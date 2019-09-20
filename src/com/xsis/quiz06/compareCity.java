package com.xsis.quiz06;

import java.util.Scanner;

public class compareCity {
    void sortCity() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First City : ");
        String c1 = sc.next();

//        System.out.print("Enter the Second City : ");
        String c2 = sc.next();

//        System.out.print("Enter the Third City : ");
        String c3 = sc.next();

        String temp;

        // Example:  c b a

        // c > b
        if (c1.compareTo(c2) > 0) {
            temp = c1;
            c1 = c2;
            c2 = temp;
        }
        // b c a

        // c > a
        if (c2.compareTo(c3) > 0) {
            temp = c2;
            c2 = c3;
            c3 = temp;
        }
        // b a c

        // a > b
        if (c1.compareTo(c2) > 0) {
            temp = c1;
            c1 = c2;
            c2 = temp;
        }
        // a b c
        System.out.println("The three capital cities in alphabetical order are : ");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
//        sc.close();
    }

}
