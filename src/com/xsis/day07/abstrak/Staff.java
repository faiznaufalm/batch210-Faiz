package com.xsis.day07.abstrak;

public class Staff extends Employee {
    public Staff(String name, String ssn, String emailAddress, int yearOfbirth, double salary) {
        super(name, ssn, emailAddress, yearOfbirth, salary);
    }

    @Override
    public double getTotalGaji() {
        return super.getSalary();
    }
}
