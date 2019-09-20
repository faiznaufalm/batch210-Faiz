package com.xsis.quiz04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Quiz gaji = new Quiz();
        Quiz reverse = new Quiz();
        Quiz calendar = new Quiz();
        Quiz countWords = new Quiz();
        Quiz compareWords = new Quiz();
        Quiz allVocal = new Quiz();

        Scanner sc = new Scanner(System.in);

        Peminjaman komik1 = new Peminjaman("One Piece");
        Peminjaman komik2 = new Peminjaman("Naruto");
        Peminjaman komik3 = new Peminjaman("Hunter X Hunter");
        Peminjaman komik4 = new Peminjaman("Solo Leveling");

        Peminjaman[] listPeminjaman = {komik1, komik2, komik3, komik4};
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        boolean done = true;
        while (done) {
            System.out.print("Pilih Soal (1 -10, 0=exit) : ");
            int command = sc.nextInt();
            sc.nextLine();
            if (command == 0) {
                done = false;
            }
            else if (command == 1) {
                Komik comic = new Komik();

                System.out.println("Masukkan Judul Komik : ");
                String judul = sc.nextLine();

                Peminjaman komikTerpilih = comic.getKomik(listPeminjaman, judul);

                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");

                System.out.println("Masukkan Tanggal Peminjaman (dd/mm/yyyy) : ");
                String startDate = sc.nextLine();
                System.out.println("Masukkan Tanggal Pengembalian (dd/mm/yyyy) : ");
                String endDate = sc.nextLine();

                LocalDate datePinjam = LocalDate.parse(startDate, dateTimeFormatter);
                LocalDate dateKembali = LocalDate.parse(endDate, dateTimeFormatter);

                comic.prosesSewa(komikTerpilih, datePinjam, dateKembali);
            }
            else if (command == 4) {
                //Soal no.4 : Hitung gaji
                System.out.print("Input Gaji per Jam : ");
                double hourSalary = sc.nextDouble();
                System.out.print("Input Jam Kerja : ");
                int hour = sc.nextInt();

                gaji.hitungGaji(hourSalary, hour);
            }
            else if (command == 5) {
                //Soal no. 5 : Reverse String
                System.out.print("Enter string to reverse : ");
                String rev = sc.nextLine();
                StringBuilder reversed = new StringBuilder(rev);

                reverse.reverseString(reversed);
            }
            else if (command == 6) {
                System.out.print("Enter a Month [1-12]:");
                int month = sc.nextInt();
                System.out.print("Enter a Year: ");
                int year = sc.nextInt();

                calendar.calendar(month, year, months);
            }
            else if (command == 7) {
                System.out.print("Input Word #1 : ");
                String word1 = sc.nextLine();
                System.out.print("Input Word #2 : ");
                String word2 = sc.nextLine();

                compareWords.compareWords(word1, word2);
            }
            else if (command == 8) {
                System.out.print("Masukkan Kata : ");
                String kata = sc.nextLine();
                countWords.hitungKata(kata);
            }
            else if (command == 9) {
                System.out.println("Masukkan Kata : ");
                String kata = sc.nextLine();

                allVocal.isAllVocal(kata);
            }

        }
    }


    //no. 4
    private void hitungGaji(double hs, int jam) {
        double gaji;
        if (jam > 8) {
            gaji = 8 * hs + (jam - 8) * (1.5 * hs);
        } else {
            gaji = jam * hs;
        }
        System.out.println("Gaji : " + gaji);
    }

    //no.5
    private void reverseString(StringBuilder reversed) {
        System.out.print("Reversed string is : ");
        System.out.println(reversed.reverse().toString());
    }

    //no.6
    private void calendar(int month, int year, String[] months) {
        // GregorianCalendar months range from 0 to 11
        month = month - 1;
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(java.util.Calendar.YEAR, year);
        calendar.set(java.util.Calendar.MONTH, month);

        int daysInMonth = calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);

        System.out.println("There are " + daysInMonth + " days in " + months[month] + " " + year);
    }

    //no.7
    private void compareWords(String word1, String word2) {
        String longest;
        if (word1.length() > word2.length()) {
            longest = word1;
        } else if (word2.length() > word1.length()) {
            longest = word2;
        } else {
            longest = "Both has the same length";
        }
        System.out.println(longest + "'s is the longest word");
    }

    //no.8
    private void hitungKata(String kata) {
        int count = 0;

        char[] word = new char[kata.length()];
        for (int i = 0; i < kata.length(); i++) {
            word[i] = kata.charAt(i);
            if (((i > 0) && (word[i] != ' ') && (word[i - 1] == ' ')) || ((word[0] != ' ') && (i == 0)))
                count++;
        }
        System.out.println("Jumlah Kata : " + count);
    }

    //no.9
    private boolean isAllVocal(String kata) {
        int index = 0;
        while (index < kata.length()) {
            char letter = kata.charAt(index);
            letter = Character.toLowerCase(letter);
            if (letter != 'a' && letter != 'e' && letter != 'i' &&
                    letter != 'o' && letter != 'u') {
                System.out.println(false);
                return false;
            }
            index++;
        }
        System.out.println(true);
        return true;
    }
}
