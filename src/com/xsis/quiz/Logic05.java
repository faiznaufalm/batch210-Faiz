package com.xsis.quiz;


import java.util.Scanner;

public class Logic05 {
    public static void main(String[] args) {
  /*      checkPalindrome("MADAM");
        checkPalindrome("XSIS");*/

        Scanner kata = new Scanner(System.in);
        System.out.println("Masukkan Kata : ");
        String s1 = kata.nextLine();
        System.out.println(checkPalindrome(s1));

        Scanner angka = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        int n = angka.nextInt();
        System.out.println((checkPalindrome(n) == 1 ? n + " merupakan Angka Palindome" : n+ " bukan Angka Palindome"));
    }

    // Java program to illustrate checking of a string
    // if its palindrome or not using reverse function
    static String checkPalindrome(String s) {
        // reverse the given String
        String reverse = new StringBuffer(s).reverse().toString();
        // check whether the string is palindrome or not
        if (s.equals(reverse)) {
          System.out.println(s + " Merupakan palindrome");
        } else {
            System.out.println(s + " Bukan palindrome");
        }
        return s;
    }

    /* Iterative function to reverse digits of num*/
    static int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    /* Function to check if n is Palindrome*/
    static int checkPalindrome(int n)
    {

        // get the reverse of n
        int rev_n = reverseDigits(n);

        // Check if rev_n and n are same or not.
        if (rev_n == n)
            return 1;
        else
            return 0;
    }
}