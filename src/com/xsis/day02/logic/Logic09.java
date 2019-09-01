package com.xsis.day02.logic;

public class Logic09 {
    public static void main(String[] args) {
        Logic09 lg = new Logic09();

        lg.logic09(7);

    }

    public void logic09(int i) {
        int j = 4;
        int interval = 2;
        for (int x = 0; x < i ; x++) {
            System.out.print(j+ " ");
            j = j * 4;
            interval +=1;
            if (interval % 2==0){
                System.out.print("* ");
            }
        }
    }
}
