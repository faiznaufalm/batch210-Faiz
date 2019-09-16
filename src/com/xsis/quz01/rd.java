package com.xsis.quz01;

import java.util.Scanner;

public class rd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle amount");
        int pa = sc.nextInt();
        System.out.println("Enter rate of interest");
        float ri = sc.nextFloat();
        System.out.println("Enter time duration in quarters like 4 quarters = 1 year");
        int duration = sc.nextInt();

        float r = 1+ri/400;
        float m = (float)Math.pow(r, duration)-1;
        float m1 = m*pa;
        float m2 = 1/(float)Math.pow(r,.33);
        float m3 = 1-m2;

        float m4 = m1/m3;
        System.out.println("Maturity "+m4);
    }
}
