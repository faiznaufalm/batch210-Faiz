package com.xsis.quiz06;

import java.util.*;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Quiz quiz = new Quiz();
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};


        boolean done = true;
        while (done) {
            System.out.print("Pilih soal (1-9, 0 = exit)  : ");
            int command = sc.nextInt();
            sc.nextLine();
            if (command == 0) {
                done = false;
            }
            else if (command == 1) {

            }
            else if (command == 2) {

            }
            else if (command == 3) {
                compareNumbers soal03 = new compareNumbers();
                soal03.compareNumbers(sc);
            }
            else if (command == 4) {
                janken janken1 = new janken();

                System.out.print("Please select one of [R=rock, P=paper, S=scissors]: ");
                String user = sc.nextLine();
                janken1.janken(user);
            }
            else if (command == 5) {

            }
            else if (command == 6) {
                testScore soal06 = new testScore();
                soal06.testScore(sc);
            }
            else if (command == 7) {
                Cake soal07 = new Cake();
                soal07.calories();
            }
            else if (command == 8) {
                Calendar soal08 = new Calendar();
                System.out.print("Enter a Month [1-12]:");
                int month = sc.nextInt();
                System.out.print("Enter a Year: ");
                int year = sc.nextInt();

                soal08.Calendar(month, year, months);
            }
            else if (command == 9) {
                compareCity soal09 = new compareCity();
                soal09.sortCity();
            }
        }
        sc.close();

    }

    /*void moneySpent(double gaji, Scanner sc) {
        double money;
        double listMoney = new[10];
        int i=1;
        boolean done = true;
        System.out.println("Money spent this month (type -1 to quit):");
        do {
                i++;
            System.out.println("Enter cost #" + i + " :");
            listMoney = sc.nextDouble();
        } while(listMoney[] != -1);
        System.out.println("Total cost : " + listMoney);



    }*/
}
