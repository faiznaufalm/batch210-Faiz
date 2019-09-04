package com.xsis.day05;

import java.util.Scanner;

public class caesar {
    // Driver code
    public static void main(String[] args)
    {
        //input text sendiri (choose one)
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Text : ");
        String text = sc.nextLine();

        //text sudah ditentukan (choose one)
        // String text = "middle-Outz";

        int s = 2;
        System.out.println("Text  : " + text);
        System.out.println("Shift : " + s);
        System.out.println("Cipher: " + encrypt(text, s));
    }
    // Encrypts text using a shift od s
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
}