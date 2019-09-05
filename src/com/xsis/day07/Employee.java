package com.xsis.day07;

public class Employee {
    private String name;
    private String ssn;
    private String emailAddress;
    private int yearOfbirth;
    private double salary;

    public Employee(String name, String ssn, String emailAddress, int yearOfbirth, double salary) {
        this.name = name;
        this.ssn = ssn;
        this.emailAddress = emailAddress;
        this.yearOfbirth = yearOfbirth;
        this.salary = salary;
    }

    public String getName() {
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

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        if (emailAddress != null && emailAddress.length() > 0) {
            this.emailAddress = emailAddress;
        }
    }

    public int getYearOfbirth() {
        return yearOfbirth;
    }

    public void setYearOfbirth(int yearOfbirth) {
        this.yearOfbirth = yearOfbirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
