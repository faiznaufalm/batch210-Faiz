package com.xsis.day06;

public class Employee {
    //instance variable = variabel milik objek
    String name;
    final String ssn;
    String emailAddress;
    int yearOfBirth;
    int extraVacationDays = 0;
    //static variabel = variabel milik class
    static int vacationDays = 10;


    //nama constructor mengikuti nama class

    public Employee(String nama, String ssn2) {
        this.name = nama;
        this.ssn = ssn2;
    }

    public Employee(String nama, String ssn2, String emailAddress2) {
        this.name = nama;
        this.ssn = ssn2;
        this.emailAddress = emailAddress2;
    }

    static void setVacationDays(int days) {
        vacationDays = days < 10? 10 : days;
    }

    static int getVacationDays() {
        return vacationDays;
    }

    void setExtraVacationDays(int days) {
        extraVacationDays = days < 0? 0 : days;
    }

    int getExtraVacationDays() {
        return extraVacationDays;
    }

     /* public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        }
    }

    public String getSsn() {
        return ssn;
    }

    public String getEmailAddress() {
            return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        if (emailAddress != null && emailAddress.length() > 0) {
            this.emailAddress = emailAddress;
        }
    }

    public int getYearOfBirth() {
            return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
    }
*/


    //non-static method
   /* void print() {
        System.out.println("Name: " + name);
        System.out.println("SSN: " + ssn);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Year Of Birth: " + yearOfBirth);
        System.out.println("Vacation Days : " + vacationDays);
        System.out.println();
    }*/

    //method overloading
    public void print(String header, String footer) {
        if (header != null) {
            System.out.println(header);
        }
        System.out.println("Name: " + name);
        System.out.println("SSN: " + ssn);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Year Of Birth: " + yearOfBirth);
        System.out.println("Vacation Days : " + vacationDays);
        if (footer != null) {
            System.out.println(footer);
        }
    }

    public void print(String header) {
        print(header, null);
    }

    public void print() {
        print(null);
    }
}

