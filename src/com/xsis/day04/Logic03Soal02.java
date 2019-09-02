package com.xsis.day04;

public class Logic03Soal02 {
    public static void main(String[] args) {
        int[][] nums = new int[7][7];
        String[][] sgtg = new String[7][7];
        Logic03Soal02 arr = new Logic03Soal02();

        arr.segitiga(nums);
        //arr.segitigastr(sgtg);
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
    }