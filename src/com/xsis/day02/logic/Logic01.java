package com.xsis.day02.logic;

import java.util.Scanner;

public class Logic01 {
    public static void main(String[] args) {
        Logic01 lg = new Logic01();
        //lg.testSoal1(14);
        //lg.testSoal2(14);
        //lg.testSoal3(7);
        //lg.testSoal5(7);
        //lg.testSoal6(7);
        //lg.testSoal7(7);
        lg.testSoal10(7);
    }

    public void testSoal1(int n){
        for (int i = 0; i <= n ; i++) {
            if (i % 2 != 0){
                System.out.print(i+" ");
            }
        }
    }

    public void testSoal2(int n){
        for (int i = 0; i <= n ; i++) {
            if (i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }

    public void testSoal3(int n){
        int deret = 1;
        for (int i = 0; i <= n ; i++) {
            System.out.print(deret+" ");
            deret = deret +3;
        }
    }

    public void testSoal5(int n){
        int deret = 1;
        int interval = 2;
        for (int i = 0; i <= n ; i++) {
            System.out.print(deret+" ");
            deret = deret +4;
            interval +=1;
            if (interval % 2==0){
                System.out.print("*");
            }
        }
    }

    public void testSoal6(int n){
        int min =4;
        int max =8;
        int interval=2;
        int deret = 1;
        for (int i = 0; i <= n ; i++) {
            System.out.print(deret+" ");
            interval +=1;
            if (interval % 2==0){
                System.out.print("* ");
                deret = deret+ max;
            }else{
                deret = deret+ min;
            }
        }
    }

    public void testSoal7(int n){
        int j = 2;
        for (int i = 0; i <= n ; i++) {
            System.out.print(j+ " ");
            j = j * 2;
        }
    }

    public void testSoal10(int n){
        int j = 3;
        for (int i = 0; i <= n ; i++) {
            System.out.print(j+ " ");
            j = j * 3;
            if (j == 3 * 27){
                System.out.println("XXX ");
            }
        }
    }
}
