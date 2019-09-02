package com.xsis.day04;

public class Logic03 {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        int[][] p = new int [3][7];


        Logic03 lg = new Logic03();

        //lg.latihan01(mat);
        lg.phytagoras(p);

    }

    void latihan01(int[][] mat) {
        int angka = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    angka++;
                    System.out.printf("%d ", mat[i][j] = angka);
                }else if (i > j) {
                    System.out.printf("%s ", "X");
                } else if (i < j) {
                    System.out.printf("%d ", mat[i][j] = 0);

                }
            }
            System.out.println();
        }
    }

    void phytagoras (int [][] p) {
        for (int n = 1; n < p.length; n++) {
            for (int m = 1; m < p[n].length; m++) {
                System.out.printf("%d  ", p[n][m] = n * m);
            }
            System.out.println();
        }
    }


}