package com.xsis.day07;

import java.util.Arrays;

public class EmployeeDemo {
    public static void main(String[] args) {
        EmployeeDemo ed = new EmployeeDemo();
        Employee[] listEmloyee = new Employee[5];
        Employee e1 = new Employee("Faiz", "1234", "faiznaufalm@gmail.com  ", 1996, 500000);
        Employee e2 = new Employee("Adam", "1235", "apurwoyo@gmail.com     ", 1996, 600000);
        Employee e3 = new Employee("Aldy", "1236", "valdypr@gmail.com      ", 1996, 550000);
        Employee e4 = new Employee("Iar ", "1237", "iaraemid@gmail.com     ",1998, 400000);
        Employee e5 = new Employee("Api ", "1238", "fajriandravli@gmail.com", 1998, 450000);
        listEmloyee[0] = e1;
        listEmloyee[1] = e2;
        listEmloyee[2] = e3;
        listEmloyee[3] = e4;
        listEmloyee[4] = e5;

        ed.findAll(listEmloyee);

    }

    public void findAll(Employee[] em) {
        System.out.println("Name        SSN         Email               Year of Birth       Salary");
        for (int i = 0; i < em.length; i++) {
            System.out.println(em[i].getName() + "       " + em[i].getSsn() + "      " + em[i].getEmailAddress() + "     " + em[i].getYearOfbirth() + "      " + em[i].getSalary());
        }
    }

}
