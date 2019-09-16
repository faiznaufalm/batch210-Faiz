package com.xsis.quiz02;

import java.util.Scanner;

public class AccountDemo {
    public static void main(String[] args) {
        Account acc = new Account(123, 500000.00);
        Account acc2 = new Account(122, 100000);
        Account acc3 = new Account(125, 1500000);
        Account acc4 = new Account(124, 2000000);

        Account[] listAccount = {acc, acc2, acc3, acc4};
        Scanner sc = new Scanner(System.in);
        boolean done = true;
        while (done) {
            System.out.print("Enter command (1=debet, 2=transfer, 0=exit) : ");
            int command = sc.nextInt();
            if (command == 1) {

                prosesDebet(acc);

            } else if (command == 0) {
                done = false;
            } else if (command == 2) {

//                double newSaldo = acc2.getSaldo()+ transfer;
                showAccount(listAccount);


                System.out.println("Masukkan Pilihan = ");
                int pilihAcc = sc.nextInt();

                Account accountReceive = getAccount(listAccount, pilihAcc);

                prosesTransfer(acc, accountReceive);


            }
        }


    }

    static void prosesDebet(Account account) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Penarikan uang tunai : ");
        double tarik = sc.nextDouble();
        if (tarik % 50000.00 != 0) {
            System.out.println("Tarik tunai harus kelipatan 50 ribu");
        }
        if(tarik>account.getSaldo()){
            System.out.println("Saldo Tidak Mencukupi");
        }
        else {
            double sisa = account.getSaldo() - tarik;
            System.out.println("Current Saldo : " + account.getSaldo());
            System.out.println("Tarik tunai : " + tarik);
            System.out.println("Sisa : " + sisa);
            account.setSaldo(sisa);
        }
    }

    static void prosesTransfer(Account account, Account account2) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Transfer");
        double transfer = sc.nextDouble();
        System.out.println("Current Saldo: " + account.getSaldo());
        System.out.printf("Transfer : %.2f %.2f" , transfer,account.getSaldo());
        if (transfer > account.getSaldo()) {
            System.out.println("Saldo anda tidak mencukupi");
        } else {
            double sisa_saldo = account.getSaldo() - transfer;
            System.out.println("Sisa Saldo " + sisa_saldo);
            account.setSaldo(sisa_saldo);
            System.out.println("saldo awal penerima : " + account2.getSaldo());

            account2.setSaldo(account2.getSaldo() + transfer);
            System.out.println("saldo penerima : " + account2.getSaldo());
        }
    }

    static void showAccount(Account[] listAccount) {
        for (int i = 0; i < listAccount.length; i++) {
            System.out.println("List Account yang dipilih: " + listAccount[i].getNorek());
            System.out.println("Saldo Account = " + listAccount[i].getSaldo());
        }
    }

    static Account getAccount(Account[] listAccount, int noRek) {
        Account account = null;
        for (int i = 0; i < listAccount.length; i++) {
            if (noRek == listAccount[i].getNorek()) {
                account = listAccount[i];
            }
        }
        return account;
    }
}
