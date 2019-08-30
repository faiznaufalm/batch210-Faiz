package com.xsis.day03;

public class Array01 {
    public static void main(String[] args) {
        int[][] nums = new int[5][5];

        Array01 arr = new Array01();

//        arr.setBox(nums);
//        arr.setDiagonalLeft(nums);
         arr.setDiagonalRight(nums);
        }

        void setDiagonalLeft(int[][] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i==j) {
                    System.out.printf("%d ", nums[i][j]=9);
                }
                else {
                    System.out.printf("%s ", "*");
                }
            }
            System.out.println();
        }
    }

        void setDiagonalRight(int[][] nums){
            for (int j = 4; j >= 0; j--) {
                for (int i = 0; i < nums[j].length; i++) {
                    if (j==i) {
                        System.out.printf("%d ", nums[j][i]=9);
                    }
                    else {
                        System.out.printf("%s ", "*");
                    }
                }
                System.out.println();
            }
        }

    void setBox(int[][] nums){
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    System.out.printf("%d ",nums[i][j]=9);
                }
                System.out.println();
            }
    }
}

