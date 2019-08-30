package com.xsis.day03;

public class Logic03 {
    public static void main(String[] args) {
        int n = 5;
        String [][] array = new String[n][n]; // 2-dimension array define...
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i == 0 || (i == array.length-1 || j==0 || j==array.length-1)){ // if top,left,right,bottom line then this...
                    array[i][j] = "*";
                }else{ // if not border line then this...
                    array[i][j] = " ";

                }
            }

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}


/*
package com.xsis.day03;

public class Logic03 {
    public static void main(String[] args) {
        int n = 7;
        int tambah = 3;
        int interval = 2;
        int deret = 2;
        int tiga = 3;
        int [][] array = new int[n][n]; // 2-dimension array define...
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(i == 0 || (i == array.length-1 || j==0 || j==array.length-1)){ // if top,left,right,bottom line then this...
                    array[i][j] = deret;
                    interval +=1;
                    if (interval % 6 == 0){
                        System.out.print(array[i][j] = Integer.parseInt(tiga+""));
                    }
                    else{
                        deret = deret+ tambah;
                        System.out.print("|"+deret+"|");
                    }
                }
            }

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "");
            }
            System.out.println("");
        }
    }
}
 */