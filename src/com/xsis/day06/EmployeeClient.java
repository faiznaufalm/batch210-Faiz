package com.xsis.day06;

public class EmployeeClient {
    public static void main(String[] args) {
        Manager m1 = new Manager("Law", "212--11-619", "Development");
        Employee.setVacationDays(15);
        m1.setExtraVacationDays(10);
        m1.print("BIG BOSS");
      /*  Employee e1 = new Employee("Faiz", "2019");
        e1.setName("Naufal");
        e1.setEmailAddress("faiznaufalm@gmail.com");
        e1.setYearOfBirth(1996);
        e1.print();
*/
        //merubah value vacation days pada class Employee
      /*  Employee.vacationDays = 15;

        //object ke-1
        Employee e1 = new Employee("Naufal", "2019-06-001");
        //e1.name = "Faiz";
        //e1.ssn = "2019-06-001";
        e1.emailAddress = "faiznaufalm@gmail.com";
        e1.yearOfBirth = 1996;*/

        //mencetak / memanggil objek ke-1
/*
        System.out.println("Nama : " + e1.name);
        System.out.println("SSN : " + e1.ssn);
        System.out.println("Email : " + e1.emailAddress);
        System.out.println("Tahun Kelahiran : " + e1.yearOfBirth);
        System.out.println();
*/

      /*  //object ke-2
        Employee e2 = new Employee("Adam", "2019-06-003", "apurwoyo@gmail.com");
        //e2.name = "Adam";
        //e2.ssn = "2019-06-003";
        //e2.emailAddress = "apurwoyo@gmail.com";
        e2.yearOfBirth = 1996;*/

        //mencetak / memanggil objek ke-2
/*
        System.out.println("Nama : " + e2.name);
        System.out.println("SSN : " + e2.ssn);
        System.out.println("Email : " + e2.emailAddress);
        System.out.println("Tahun Kelahiran : " + e2.yearOfBirth);
        System.out.println();
*/


        //static method
/*
        printEmployee2(e1);
        printEmployee2(e2);
*/

       /* //mencetak / memanggil method di class Employee
        e1.print();
        e2.print();*/

    }

    //static method
 /*   static void printEmployee2(Employee e) {
        System.out.println("static method");
        System.out.println("Nama : " + e.name);
        System.out.println("SSN : " + e.ssn);
        System.out.println("Email : " + e.emailAddress);
        System.out.println("Tahun Kelahiran : " + e.yearOfBirth);
        System.out.println();*/
    }

