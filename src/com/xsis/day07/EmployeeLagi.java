package com.xsis.day07;

public class EmployeeLagi {
    private String name;
    private String ssn;
    private String emailAddress;
    private int yearOfbirth;
    private double salary;

    public EmployeeLagi(String name, String ssn, String emailAddress, int yearOfbirth, double salary) {
        if (salary < 1.0) throw new IllegalArgumentException("Salary should be more than 1");
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
        this.name = name;
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
        this.emailAddress = emailAddress;
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

    @Override
    public String toString() {
        return "EmployeeLagi{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", yearOfbirth=" + yearOfbirth +
                ", salary=" + salary +
                '}';
    }
}
