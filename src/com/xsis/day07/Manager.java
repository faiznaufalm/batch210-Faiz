package com.xsis.day07;

public class Manager extends EmployeeLagi implements EmployeeInterface {
    private double commision;

 /*   public Manager(String name, String ssn, String emailAddress, int yearOfbirth, double salary) {
        super(name, ssn, emailAddress, yearOfbirth, salary);
    }*/

    public Manager(String name, String ssn, String emailAddress, int yearOfbirth, double salary, double commision) {
        super(name, ssn, emailAddress, yearOfbirth, salary);
        this.commision = commision;
    }

    @Override
    public String getInfoEmployee() {
        System.out.println("Method call from object manager");
        System.out.println(toString());
        return null;
    }

    @Override
    public void potongGaji(double potongan) {
        super.setSalary(super.getSalary() - potongan);
    }

    public double getCommision() {
        return commision;
    }

    public void setCommision(double commision) {
        this.commision = commision;
    }

    @Override
    public double getSalary() {
        double totalCommision = this.commision * super.getSalary();
        return super.getSalary() + totalCommision;
    }

    @Override
    public String toString() {
        return super.toString() + ", commision = " + this.commision + ", salary + commsion = " + getSalary();
    }
}
