package com.xsis.day04;

public class Logic03Soal02 {
    public static void main(String[] args) {
        int[][] nums = new int[7][7];
        String[][] sgtg = new String[7][7];
        Logic03Soal02 arr = new Logic03Soal02();

        int num[][] = new int[7][7];


        //arr.segitiga(nums);
        //arr.segitigastr(sgtg);
        arr.segitigabaru(num);
    }

    private void segitigastr(String[][] sgtg) {
        for (int i = 0; i < sgtg.length; i++) {
            for (int j = 0; j < sgtg.length; j++) {
                if(i == sgtg.length-2 && j == 1 || (i == sgtg.length-3 && j == 2 || (i == sgtg.length-4 && j == 3 || (i == sgtg.length-5 && j == 4 || i == sgtg.length-6 && j == 5 || i == sgtg.length-7 && j ==6 || (i == sgtg.length-1 || j==sgtg.length-1))))){ // if top,left,right,bottom line then this...
                    sgtg[i][j] = "2";
                }else{ // if not border line then this...
                    sgtg[i][j] = " ";

                }
            }

        }

        for (int i = 0; i < sgtg.length; i++) {
            for (int j = 0; j < sgtg.length; j++) {
                System.out.print(sgtg[i][j] + " ");
            }
            System.out.println("");
        }
    }

    void segitiga(int[][] nums) {
        int z = 1;
            for (int i = 6; i >= 0; i--) {
                for (int j = 0; j < nums.length; j++) {
                        if (i == nums.length - 2 && j == 1 || (i == nums.length - 3 && j == 2 || (i == nums.length - 4 && j == 3 || (i == nums.length - 5 && j == 4 || i == nums.length - 6 && j == 5 || i == nums.length - 7 && j == 6 || (i == nums.length - 1 || j == nums.length - 1))))) { // if top,left,right,bottom line then this...
                            nums[i][j] = z++;
                        }else{ // if not border line then this...
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

        void segitigabaru(int[][] num) {
            int i,j;
            int intervalAwal=1;
            int intervalAkhir=3;
            int n1=17;
            int n2=41;
            int n3=20;
            int x=3;

            for (i=6; i>=0; i--){
                for (j=0; j<=num[i].length; j++){

                    // Atas
                    if (i==j){
                        if (intervalAwal <= intervalAkhir) {
                            System.out.print(n1);
                            System.out.print(" ");

                            n1 -= 3;
                            intervalAwal ++;
                        }
                        else {
                            System.out.print(x);
                            System.out.print(" ");

                            intervalAwal=1;
                        }
                    }

                    // Bawah
                    else if (i==0){
                        if (j>=1 && j<=2){
                            System.out.print(n2);
                            System.out.print(" ");
                            n2 -= 3;
                            x*=3;
                        }

                        else if (j>=4 && j<=6) {
                            System.out.print(n2);
                            System.out.print(" ");
                            n2 -= 3;
                        }

                        else {
                            if (j==num.length){
                                break;
                            }

                            x*=3;
                            System.out.print(x);
                            System.out.print(" ");
                        }
                    }

                    // Kanan
                    else if (j==6) {
                        if (i==5) {
                            System.out.print(x*3);
                            System.out.print(" ");
                        }

                        else if (i>=2 && i<=4){
                            System.out.print(n3);
                            System.out.print(" ");
                            n3 += 3;
                        }

                        else if (i==1) {
                            System.out.print(x*3*3);
                            System.out.print(" ");
                        }
                    }

                    else {
                        System.out.print(" ");
                        System.out.print(" ");
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }