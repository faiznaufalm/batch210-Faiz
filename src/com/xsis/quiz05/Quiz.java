package com.xsis.quiz05;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();


        Scanner sc = new Scanner(System.in);

        boolean done = true;
        while (done) {
            System.out.print("Pilih Soal (1 - 7, 0=exit) : ");
            int command = sc.nextInt();
            sc.nextLine();
            if (command == 0) {
                done = false;
            }
            else if (command == 1) {
                quiz.printStarString(5);
            }
            else if (command == 2) {
                quiz.printNolGenap(10);
            }
            else if (command == 3) {
                return;
            }
            else if (command == 4) {
                quiz.isPalindrome("ada");
            }
            else if (command == 5) {
                return;
            }
            else if (command == 6) {
                return;
            }
            else if (command == 7) {
                return;
            }
        }
    }

    String starString(int n) {
        if (n <= 0) {
            return "*";
        } else {
            return starString(n - 1) + starString(n - 1);

        }
    }

    void printStarString(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(starString(i));
        }
    }

    int nolGenap(int n) {
        if (n % 2 != 0) {
            return 0;
        } else {
            return nolGenap(n - 1) + n;
        }
    }

    void printNolGenap(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.print(nolGenap(i) + " , ");
            System.out.println();
        }
    }

    boolean isPalindrome(String s) {
        // if length is 0 or 1 then String is palindrome
        if (s.length() == 0 || s.length() == 1) {
            System.out.println(true);
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            /* check for first and last char of String:
             * if they are same then do the same thing for a substring
             * with first and last char removed. and carry on this
             * until you string completes or condition fails
             * Function calling itself: Recursion
             */
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        /* If program control reaches to this statement it means
         * the String is not palindrome hence return false.
         */
        System.out.println(false);
        return false;
    }
}

