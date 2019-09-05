package com.xsis.day04;

public class Logic02 {
    public static void main(String[] args) {
    int[][] nums = new int[2][7];
    int[] arr = new int[7];

    Logic02 logic = new Logic02();

    logic.soal01(nums);
    //logic.soal02(arr);
    //logic.soal03(nums);
    //logic.soal04(nums);
    //logic.tes03(arr);
}

    void soal01(int[][] nums) {
        int x = 0;
        int z = 1;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                if (i == 0) {
                    System.out.print(x + " ");
                    nums[i][j] = x++;
                }
                else {
                    System.out.print((z+ " "));
                    z = z*3;
                }
            }
            System.out.println();
        }
    }

    void soal02(int[] arr){
        int hasil =1;
        for (int i = 0; i < 7; i++){
            if (i ==0) {
                hasil = hasil * 1;
            }else if(i == 2 || (i == 5)) {
                hasil = hasil * -3;
            }else{
                hasil = hasil * 3;
            }
            System.out.print(hasil + " ");
        }
    }

    void soal03(int[][] nums){
        int x = 0;
        int z = 2;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                if (i == 0) {
                    System.out.print(x + " ");
                    nums[i][j] = x++;
                }
                else if (i == 1 && j == 0){
                    System.out.print(z+ " ");
                    z = z*3;
                }
                else if (i == 1 && j == 1 || (i == 1 && j == 2)){
                    System.out.print(z+ " ");
                    z = z*2;
                }
                else if (i == 1 && j == 3 || (i == 1 && j == 4)){
                    System.out.print(z+ " ");
                    z = z/2;
                }
                else if (i ==1 && j == 5 || (i == 1 && j == 6)){
                    System.out.print(z+ " ");
                    z = z/3;
                }
            }
            System.out.println();
        }
    }

    void tes03(int[] arr){
        int hasil =2;
        for (int i = 0; i < 7; i++){
            if (i == 1) {
                hasil = hasil * 3;
            }
            else if (i >=2 && i <=3) {
                hasil = hasil *2;
            }
            else if (i >=4 && i <=5) {
                hasil = hasil/2;
            }
            else if (i == 6) {
                hasil = hasil/3;
            }
            System.out.print(hasil +" ");
        }
    }

}

