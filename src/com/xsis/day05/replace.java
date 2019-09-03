package com.xsis.day05;

import java.util.Scanner;

public class replace {
    public static void main(String[] args ) {
        replace rep = new replace();
        String str = "Aku Sayang Kamu";
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str2 = in.nextLine();

        System.out.print("Jumlah Kata : " + hitung(str2 ));
        System.out.println();
        rep.ganti(str);


    }

    void ganti (String kalimat) {
        String ganti = kalimat.replace("k", "*"). replace("ayan", "****"). replace("am", "**");
        System.out.println(ganti);
    }

    public static int hitung(String str2)
    {
        int count = 0;
        if (!(" ".equals(str2.substring(0, 1))) || !(" ".equals(str2.substring(str2.length() - 1))))
        {
            for (int i = 0; i < str2.length(); i++)
            {
                if (str2.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1;
        }
        return count; // returns 0 if string starts or ends with space " ".
    }
}
