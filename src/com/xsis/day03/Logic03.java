package com.xsis.day03;

public class Logic03 {
    public static void main(String[] args) {
        int[][] nums = new int[7][7];
        int[][] mat = new int[5][5];
        Logic03 lg = new Logic03();

        //lg.kotak(nums);
        lg.soal01(mat);
    }
    void kotak(int[][] nums) {
        int z = 2;
        int interval = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == 0 || (i == nums.length - 1 || j == 0 || j == nums.length - 1)) { // if top,left,right,bottom line then this...
                    nums[i][j] = z;
                    z = z + 3;
                    interval += 1;
                }
                 else if (interval % 4 == 0){
                     z = 3;
                    }
                else { // if not border line then this...
                    System.out.printf("");

                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + "   ");
            }
            System.out.println("");

                }
            }

            void soal01(int[][] mat) {
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



}


